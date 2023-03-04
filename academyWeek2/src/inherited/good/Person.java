package inherited.good;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getDetails() {
        return "이름: " + this.name + ", 나이: " + this.age;
    }
}
