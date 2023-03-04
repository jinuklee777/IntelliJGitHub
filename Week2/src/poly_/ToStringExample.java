package poly_;

public class ToStringExample {
    public static void main(String[] args) {
        Member m1 = new Member("이진욱", 20);
        println(m1);
        String a = new String("a");
        println(a);
    }

    static void println(Object object) {
        System.out.println(object.toString());
    }
}
