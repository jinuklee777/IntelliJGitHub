package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이진욱";
        int hour = 15;

        System.out.println(name + "배송이 시작되었습니다." +hour +"시");
        System.out.println(name + "배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "파이팅";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade);

        boolean pass = true;
        System.out.println("합격여부" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
