package object_;

public class Human {
    String name;
    int age;

    void hello() {
        System.out.println("안녕하세요 저는 " + name + "입니다.");
    }
    Human() {
        this.name = "이름없음";
    }
}