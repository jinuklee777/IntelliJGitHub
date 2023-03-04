package stream_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/Users/jinuklee/Desktop/test.txt");
             BufferedReader br = new BufferedReader(fr);) {
            String data = null;
            while ((data = br.readLine()) != null) {
                String[] datas = data.split(",");
                System.out.println("이름: " + datas[0] + ", 이메일: " + datas[1] + ", 나이: " + datas[2]);
            }
            System.out.println("파일로드완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
