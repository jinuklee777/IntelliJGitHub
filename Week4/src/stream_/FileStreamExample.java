package stream_;

import java.io.FileReader;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/Users/jinuklee/Downloads/05_문제.txt");) {
            char[] buffer = new char[128];
            int readCount = fr.read(buffer);
            while (readCount != -1) {
                String data = new String(buffer, 0, readCount);
                System.out.println("읽어온 데이터: " + data);
                readCount = fr.read(buffer);
            }
            System.out.println("파일로드완료");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
