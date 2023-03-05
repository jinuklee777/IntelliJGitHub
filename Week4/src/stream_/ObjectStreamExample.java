package stream_;

import java.io.*;
import java.util.*;

public class ObjectStreamExample {
    public static void main(String[] args) {
//        try(FileOutputStream fos = new FileOutputStream("a.data");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//        Person p1 = new Person("이진욱", 21);
//        Person p2 = new Person("허수", 21);
//        List<Person> personList = new ArrayList<>();
//        personList.add(p1); personList.add(p2);
//        oos.writeObject(p1);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("객체 스트림 내보내기 완료");

        try (FileInputStream fis = new FileInputStream("a.data");
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            List<Person> personList = (List<Person>) ois.readObject();
            System.out.println(personList);
            System.out.println("파일 로드 완료.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
