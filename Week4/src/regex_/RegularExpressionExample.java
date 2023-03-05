package regex_;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String tel1 = "010-1234-5678";
        String tel2 = "0-8765-4321";
        String tel3 = "010 1357 2468";
        String tel4 = "000-2468-1357";

        if(tel1.matches("^[0][1][0](-|\\s)\\d{4}(-|\\s)\\d{4}$")) {
            System.out.println(tel1);
        }
        if(tel2.matches("^[0][1][0](-|\\s)\\d{4}(-|\\s)\\d{4}$")) {
            System.out.println(tel2);
        }
        if(tel3.matches("^[0][1][0](-|\\s)\\d{4}(-|\\s)\\d{4}$")) {
            System.out.println(tel3);
        }
        if(tel4.matches("^[0][1][0](-|\\s)\\d{4}(-|\\s)\\d{4}$")) {
            System.out.println(tel4);
        }
        // 주민등록번호
        String data1 = "030404-3131234";
        String data2 = "030922-4230948";
        String data3 = "030619-4382971";
        String data4 = "911339-9812378";

        if(data1.matches("^\\d{2}([0][1-9]|[1][0-2])([0][1-9]|[1-2][0-9]|[3][0-1])-" +
                "[1-4]\\d{6}$")){
            System.out.println(data1);
        }
        if(data2.matches("^\\d{2}([0][1-9]|[1][0-2])([0][1-9]|[1-2][0-9]|[3][0-1])-" +
                "[1-4]\\d{6}$")){
            System.out.println(data2);
        }
        if(data3.matches("^\\d{2}([0][1-9]|[1][0-2])([0][1-9]|[1-2][0-9]|[3][0-1])-" +
                "[1-4]\\d{6}$")){
            System.out.println(data3);
        }
        if(data4.matches("^\\d{2}([0][1-9]|[1][0-2])([0][1-9]|[1-2][0-9]|[3][0-1])-" +
                "[1-4]\\d{6}$")){
            System.out.println(data4);
        }
        String email1 = "abc@naver.com";
        String email2 = "ase1234@soongsil.ac.kr";
        String email3 = "102-@ajfoi@nagvw.lm";
        String email4 = "_weofij@nwef.cne";
        if(email1.matches("^[0-9a-zA-Z]+\\w*@[0-9a-z]+\\.([a-z]{3}|[a-z]{2}\\.[a-z]{2})$")) {
            System.out.println(email1);
        }
        if(email2.matches("^[0-9a-zA-Z]+\\w*@[0-9a-z]+\\.([a-z]{3}|[a-z]{2}\\.[a-z]{2})$")) {
            System.out.println(email2);
        }
        if(email3.matches("^[0-9a-zA-Z]+\\w*@[0-9a-z]+\\.([a-z]{3}|[a-z]{2}\\.[a-z]{2})$")) {
            System.out.println(email3);
        }
        if(email4.matches("^[0-9a-zA-Z]+\\w*@[0-9a-z]+\\.([a-z]{3}|[a-z]{2}\\.[a-z]{2})$")) {
            System.out.println(email4);
        }

    }
}
