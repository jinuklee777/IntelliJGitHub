package map_;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("이진욱", 20);
        map.put("이유빈", 21);
        map.put("지선의", 22);
        map.put("이진욱", 21);
        System.out.println(map);
        System.out.println(map.get("이진욱"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
        }
        for (String key : map.keySet()) {
            System.out.println("키: " + key + ", 값: " + map.get(key));
        }
    }
}
