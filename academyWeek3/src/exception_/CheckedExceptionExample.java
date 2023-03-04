package exception_;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("/Users/jinuklee/Desktop/test.rtf");
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("실행 완료");
    }
}
