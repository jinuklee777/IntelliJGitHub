package inherited.good;


public class InheritedExample {
    public static void main(String[] args) {
        Person p1 = new Person("이진욱", 20);
        Student s1 = new Student("이진욱", 20, 20223159);
        Teacher t1 = new Teacher("이진욱", 20, "C++");
//        System.out.println(p1.getDetails());
//        System.out.println(s1.getDetails());
//        System.out.println(t1.getDetails());

        Person p2 = (Person)s1;
        Person p3 = (Person)t1;
        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());
        System.out.println(p3.getDetails());

    }
}
