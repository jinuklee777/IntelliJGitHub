package poly_;

public class Person {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        eat(apple);
        eat(orange);
    }
    static void eat(Fruit fruit) {
        System.out.println("사람이 "+fruit.getName()+"을 먹습니다.");
    }
}
