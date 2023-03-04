package Week1;

public class _02_Diamond {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                if (k == 0 || k == i * 2) {
                    System.out.print("*");
                } else if (k % 2 == 0) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int l = 0; l < 5; l++) {
            for (int m = 0; m < l + 1; m++) {
                System.out.print(" ");
            }
            for (int n = 8; n > l * 2 + 1; n--) {
                if (n == 8 || n == l * 2 + 2) {
                    System.out.print("*");
                } else if (n % 2 == 0) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
