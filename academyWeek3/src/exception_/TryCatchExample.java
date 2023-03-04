package exception_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자만 입력하세요.");
        System.out.print("입력: ");
        int num = 0; // 선언은 밖에서..
        try {
            num = scan.nextInt();
            num = num / (int)(Math.random()*2);
        }catch (InputMismatchException e) {
            System.out.println("숫자만 입력하셔야 합니다.");
            System.out.println("기본값 0 할당.");
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        finally {
            scan.close();
        }
        System.out.println("입력받은 값: "+num);
    }
}
