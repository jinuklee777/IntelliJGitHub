package abstract_;

public class ShapeExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 5;
        System.out.println(c.getArea());

        Shape shape = new Circle();
        System.out.println(shape.getArea());
    }
}
