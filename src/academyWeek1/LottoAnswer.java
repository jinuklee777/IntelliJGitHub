package academyWeek1;

import java.util.Arrays;

public class LottoAnswer {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int index = 0;
        while (true) {
            int ran = (int) (Math.random() * 45) + 1;
            int i = 0;
            for (i = 0; i < index; i++) {
                if (ran == lotto[i]) {
                    break;
                }
            }
            if (index == i) {
                lotto[index++] = ran;
            }
            if (index > 5) {
                break;
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}
