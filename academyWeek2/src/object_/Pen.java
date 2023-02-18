package object_;

public class Pen {

    // 클래스의 멤버 - 변수, 메서드, 생성자
    // 클래스에는 기본적으로 멤버만 작성 가능

    // 멤버 변수 (인스턴스 변수)
    // 기본값 자동 할당
    String color;
    int price;

    void write(String message) {
        System.out.println("색깔 : " + color + ", 내용: " + message);
    }

    // 생성자
    // 객체를 생성하는 역할
    // 명시적으로 작성하지 않아도 기본 생성자를 컴파일러가 생성 - 명시적으로 작성하는 경우는 생성 X
    // 이름이 클래스와 동일 - 대소문자까지
    Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }
}
