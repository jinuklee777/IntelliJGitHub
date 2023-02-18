package object_;

public class PenExample {
    public static void main(String[] args) {
        // 객체 생성 : 클래스 변수명 = new 생성자;
        Pen redPen = new Pen("빨강", 1000);
        redPen.write("안녕하세요");
        Pen blackPen = new Pen("검정", 2000);

        Pen[] penArray = new Pen[6];
    }
}
