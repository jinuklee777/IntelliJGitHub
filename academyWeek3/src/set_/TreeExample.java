package set_;

import java.util.Set;
import java.util.TreeSet;

public class TreeExample {
    public static void main(String[] args) {
        Set<Integer> intSet = new TreeSet<>();
        intSet.add(10); intSet.add(5); intSet.add(4);
        intSet.add(1); intSet.add(6);
        System.out.println(intSet);

        Set<String> strSet = new TreeSet<>();
        strSet.add("a"); strSet.add("가"); strSet.add("나");
        strSet.add("b"); strSet.add("1");
        System.out.println(strSet);

        Set<Person> pset = new TreeSet<>();
        pset.add(new Person("이진욱", 20));
        pset.add(new Person("이유빈", 21));
        pset.add(new Person("지선의", 22));
        System.out.println(pset);
    }
}
