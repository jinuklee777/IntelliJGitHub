package stream_;

import java.util.*;
import java.io.*;
import java.net.*;

public class WebCrawler {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.nate.com";
        HttpURLConnection con = null;
        BufferedReader br = null;
        FileWriter fw = null;
        while (true) {
            Date time = new Date();
            String fileName = (time.getYear() + 1900) + "년" + (time.getMonth() + 1) + "월" + time.getDate() + "일" +
                    time.getHours() + "시" + time.getMinutes() + "분의 실시간 검색어.txt";
            try {
                con = (HttpURLConnection) (new URL(url)).openConnection();
                br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
                fw = new FileWriter(fileName);
                String temp;
                int rank = 1;
                while ((temp = br.readLine()) != null) {
                    if (temp.contains("txt_rank")) {
                        String word = temp.split((">"))[1].split("<")[0];
                        fw.write(rank++ +"위: "+word);
                        fw.write("\r\n");
                        fw.flush();
                    }
                    if(rank==0) {
                        break;
                    }
                }
                System.out.println("검색어 파일 추출 완료");
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                if(br!=null) {try{br.close();}catch(IOException e) {}}
                if(fw!=null) {try{fw.close();}catch(IOException e) {}}
                if(con!=null) {con.disconnect();}
            }
            Thread.sleep(600000);
        }
    }
}
