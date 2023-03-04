package academyWeek1;

import java.util.Arrays;
import java.util.Random;

// 앞에서 배운 난수 발생과 반복문, 조건문을 통해 중복되는 번호없이 1~45 까지의 숫자 중 6개의 숫자를 랜덤추출하고
// 콘솔에 출력해보세요.
public class _03_Lotto {
    public static void main(String[] args) {
        int[] lotto = {0, 0, 0, 0, 0, 0};
        int k = 0;
        int i = 0;
        while (true) {
            int rand = (int) (Math.random() * 6) + 1;
            for (i = 0; i < 6; i++) {
                if (rand == lotto[i]) {
                    break;
                }
            }
            if (i == 6) {
                lotto[k] = rand;
                k++;
            }
            if (k == 6) {
                break;
            }
        }
//        for (int m = 0; m < 6; m++) {
//            System.out.print(lotto[m] + "\t");
//        }
        System.out.println(Arrays.toString(lotto));
    }
}
