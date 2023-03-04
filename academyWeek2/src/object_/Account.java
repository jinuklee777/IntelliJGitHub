package object_;

public class Account {
    String name;
    String bankName;
    String accountNumber;
    String password;
    long balance;

    // 입금, 출금, 송금, 잔액조회
    // 실제 작동 원리와 같게 구현
    // 각 기능의 마지막에는 계좌 잔액 표시
    // 송금은 다른 계좌에 돈이 증가해야함.
    void checkBalance() {
        System.out.println(this.name + "님의 현재 잔액: " + this.balance);
    }

    boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    void deposit(long money) {
        this.balance += money;
        checkBalance();
    }

    void withdraw(long money, String password) {
//        if (checkPassword(password)) {
//            if (this.balance - money < 0) {
//                System.out.println("잔액이 부족합니다.");
//            } else {
//                this.balance -= money;
//                System.out.println(this.name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
//                checkBalance();
//            }
//        } else {
//            System.out.println("비밀번호가 다릅니다.");
//        }
        if (!checkPassword(password)) {
            System.out.println("비밀번호가 다릅니다.");
            return;
        }
        if (this.balance - money < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.balance -= money;
        System.out.println(this.name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
        checkBalance();
    }

    void transfer(long money, String password, Account account) {
        if (!checkPassword(password)) {
            System.out.println("비밀번호가 다릅니다.");
            return;
        }
        if (this.balance - money < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.balance -= money;
        account.balance += money;
        System.out.println(this.name + "님의 계좌에서 " + account.name + "님의 계좌로 " + money + "원이 출금되었습니다.");
        checkBalance();
    }

    Account(String name, String bankName, String password) {
        //신한 = 0, 국민 = 1, 하나 = 2, 우리 = 3, 나머지는 9로 계좌번호 시작
        // 은행명에 따라 해당 숫자로 시작하는 9자리 계좌번호 랜덤 생성
        this.accountNumber = createAccountNumber(bankName);
        this.name = name;
        this.bankName = bankName;
        this.password = password;
    }

    String createAccountNumber(String bankName) {
        String result = "";
        switch (bankName) {
            case "신한":
                result += 0;
                break;
            case "국민":
                result += 1;
                break;
            case "하나":
                result += 2;
                break;
            case "우리":
                result += 3;
                break;
            default:
                result += 9;
        }
        for (int i = 0; i < 8; i++) {
            result += (int) (Math.random() * 10);
        }
        return result;
    }

    String createAccountNumberByMe(String bankName) {
        String result = "";
        String[] accountNum = new String[9];
        for (int i = 1; i < 9; i++) {
            int rand = (int) (Math.random() * 9) + 1;
            String str = String.valueOf(rand);
            accountNum[i] = str;
        }
        if (bankName == "신한") {
            accountNum[0] = "0";
        } else if (bankName == "국민") {
            accountNum[0] = "1";
        } else if (bankName == "하나") {
            accountNum[0] = "2";
        } else if (bankName == "우리") {
            accountNum[0] = "3";
        } else {
            accountNum[0] = "9";
        }
        for (int i = 0; i < 9; i++) {
            result += accountNum[i];
        }
        return result;
    }

    String printAccount() {
        return "예금주: " + this.name + "\n" +
                "은행명: " + this.bankName + "\n" +
                "계좌번호: " + this.accountNumber;
    }
}
