package crud;

import java.util.*;
import java.io.*;

public class CustomerManager {
    private static final Scanner scan = new Scanner(System.in);
    private static List<Customer> cusList = new ArrayList<>();
    private static Set<String> nameSet = new TreeSet<>();

    public static void main(String[] args) {
        loadCustomerData();
        while (true) {
            System.out.println("[INFO]");
            System.out.println("현재 고객 정보 데이터 개수: " + cusList.size());
            System.out.println("메뉴를 선택해주세요. ");
            System.out.println("(C)reate, (R)ead, read(A)ll, (U)pdate, (D)elete, (Q)uit");
            System.out.println("메뉴: ");
            String menu = scan.next();
            switch (menu.charAt(0)) {
                case 'c':
                case 'C':
                case 'ㅊ':
                    createCustomer();
                    saveCustomerData();
                    break;
                case 'r':
                case 'R':
                case 'ㄱ':
                    if (cusList.size() <= 0) {
                        System.out.println("조회할 데이터가 없습니다...");
                    } else {
                        readCustomer(searchCustomer());
                    }
                    break;
                case 'a':
                case 'A':
                case 'ㅁ':
                    readCustomerAll();
                    break;
                case 'u':
                case 'U':
                case 'ㅕ':
                    if (cusList.size() <= 0) {
                        System.out.println("수정할 데이터가 없습니다...");
                    } else {
                        updateCustomer(searchCustomer());
                        saveCustomerData();
                    }
                    break;
                case 'D':
                case 'd':
                case 'ㅇ':
                    if (cusList.size() <= 0) {
                        System.out.println("삭제할 데이터가 없습니다...");
                    } else {
                        deleteCustomer(searchCustomer());
                        saveCustomerData();
                    }
                    break;
                case 'q':
                case 'Q':
                case 'ㅂ':
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");

            }
        }
    }

    private static void createCustomer() {
        System.out.println("고객 정보를 입력하세요.");
        String name;
        while (true) {
            System.out.println("이름: ");
            name = scan.next();
            boolean isNotOverlap = nameSet.add(name);
            if (isNotOverlap) {
                break;
            }
            System.out.println("이름이 중복됩니다. 다시 입력해주세요.");
        }
        System.out.println("나이: ");
        int age = scan.nextInt();
        System.out.println("이메일: ");
        String email = scan.next();
        System.out.println("주소: ");
        String address = scan.next();

        Customer c1 = new Customer(name, age, email, address);
        cusList.add(c1);
        System.out.println("고객 정보 저장 완료.");
    }

    private static Customer searchCustomer() {
        while (true) {
            System.out.println("조회, 수정 또는 삭제하려는 고객의 이름을 입력하세요.");
            System.out.println("또는 메뉴로 돌아가시려면 Q를 눌러주세요.");
            System.out.println("이름: ");
            String name = scan.next();
            if (name.charAt(0) == 'q' || name.charAt(0) == 'Q' || name.charAt(0) == 'ㅂ') {
                return null;
            }
            for (Customer cus : cusList) {
                if (cus.getName().equals(name)) {
                    return cus;
                }
            }
        }
    }

    private static void readCustomer(Customer cus) {
        if (cus == null) {
            System.out.println("메뉴로 돌아갑니다.");
            return;
        }
        System.out.println("-------------------------------------------");
        System.out.println(cus);
        System.out.println("-------------------------------------------");
    }

//    private static void readCustomerAll() {
//        Iterator<Customer> readAll = cusList.iterator();
//        while (readAll.hasNext()) {
//            System.out.println(readAll.next());
//        }
//    }
//
//    private static void readCustomerAll2() {
//        String[] names = new String[cusList.size()];
//        for (int i = 0; i < cusList.size(); i++) {
//            names[i] = cusList.get(i).getName();
//        }
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//    }

    private static void readCustomerAll() {
        for (int i = 0; i < cusList.size(); i++) {
            System.out.println(cusList.get(i).getName());
        }
    }

    private static void updateCustomer(Customer cus) {
        if (cus == null) {
            System.out.println("메뉴로 돌아갑니다.");
            return;
        }
        System.out.println("이름(" + cus.getName() + ")");
        System.out.printf("나이(%d) : ", cus.getAge());
        cus.setAge(scan.nextInt());
        System.out.printf("이메일(%s): ", cus.getEmail());
        cus.setEmail(scan.next());
        System.out.printf("주소(%s): ", cus.getAddress());
        cus.setAddress(scan.next());
        System.out.println("고객 정보 수정 완료.");

    }

    private static void deleteCustomer(Customer cus) {
        if (cus == null) {
            System.out.println("메뉴로 돌아갑니다.");
            return;
        }
        System.out.println(cus.getName() + "님의 정보를 삭제합니다.");
        for (int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cusList.remove(cus);
        System.out.println("삭제가 완료되었습니다.");
    }

    private static void saveCustomerData() {
        try (FileOutputStream fos = new FileOutputStream("cus.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(cusList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void loadCustomerData() {
        try (FileInputStream fis = new FileInputStream("cus.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            cusList = (List<Customer>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("로드 파일이 없습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
