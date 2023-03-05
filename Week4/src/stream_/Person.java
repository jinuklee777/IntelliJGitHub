package stream_;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 5296081940199618979L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
