package poly_;

public class Person {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        eat(apple);
        eat(orange);

        eat(new Pork());
        eat(new Beef());
    }
    static void eat(Food food) {
        System.out.println("사람이 "+food.getName()+"을 먹습니다.");
    }
}
