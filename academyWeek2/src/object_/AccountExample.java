package object_;

public class AccountExample {
    public static void main(String[] args) {
        Account acc1 = new Account("이진욱", "토스뱅크", "1234");
        Account acc2 = new Account("이유빈", "우리", "0000");
        System.out.println(acc1.printAccount());
        acc1.deposit(100000);
        acc1.withdraw(5000,"1234");
        acc1.transfer(10000,"1234", acc2);
        acc2.checkBalance();
        System.out.println(acc2.printAccount());
    }
}
