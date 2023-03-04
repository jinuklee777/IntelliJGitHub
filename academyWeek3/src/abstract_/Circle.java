package abstract_;

public class Circle extends Shape{

    public int r;

    @Override
    public double getArea() {
        return Math.PI * r *r;
    }
}
