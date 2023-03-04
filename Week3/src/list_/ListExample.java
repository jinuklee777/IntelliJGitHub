package list_;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a"); arrayList.add("ab");
        arrayList.add("abc"); arrayList.add("abcd");
        arrayList.add(0, "abcde");
        System.out.println(arrayList);
        arrayList.set(2,"abcdef");
        System.out.println(arrayList.contains("AB"));
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
        arrayList.remove("abcd");
        System.out.println(arrayList);
        for(String data: arrayList) {
            System.out.println(data);
        }

    }
}
