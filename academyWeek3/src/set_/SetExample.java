package set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1"); set.add("가나");
        set.add("다"); set.add("가나");
        System.out.println(set);
        System.out.println(set.contains("1"));
        for(String data : set){
            System.out.println(data);
        }
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(createLotto());
    }
    static Set<Integer> createLotto() {
        Set<Integer> lottoSet = new HashSet<>();
        while(lottoSet.size() <6) {
            lottoSet.add((int)(Math.random()*45)+1);
        }
        return lottoSet;
    }
}
