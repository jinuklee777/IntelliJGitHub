package generic_;

public class Person<E> {
    private E name;
    private int age;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(E name, int age) {
        this.name = name;
        this.age = age;
    }
    public static <T> T test(T t) {
        return t;
    }
}
