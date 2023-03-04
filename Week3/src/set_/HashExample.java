package set_;

import java.util.HashSet;
import java.util.Set;

public class HashExample {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("이진욱", 21));
        set.add(new Person("이진욱",21));

        System.out.println(set);
        System.out.println(set.size());
    }
}
