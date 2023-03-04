package generic_;

public class GenericExample {
    public static void main(String[] args) {
        int a = Person.test(10);
        String b = Person.test("a");
        Person<String> p = Person.test(new Person("이진욱", 21));
    }
}
