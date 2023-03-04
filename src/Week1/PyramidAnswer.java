package Week1;

public class PyramidAnswer {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");

                } else {
                    if (j % 2 == 0) {
                        System.out.print("$");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 9 - 2 * i; j++) {
                if (j == 0 || j == 8 - 2 * i) {
                    System.out.print("*");
                } else {
                    if (j % 2 == 0) {
                        System.out.print("$");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
