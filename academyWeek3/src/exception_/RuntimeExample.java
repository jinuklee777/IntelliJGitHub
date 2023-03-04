package exception_;

public class RuntimeExample {
    public static void main(String[] args) {
        NullPointerException();
    }
    static void IndexException() {
        int[] array = new int[3];
        System.out.println(array[5]);
    }
    static void ArithmeticException() {
        int a = 3;
        int b = 0;
        System.out.println(a/b);
    }
    static void NullPointerException() {
        String a = null;
        System.out.println(a.charAt(0));
    }
}
