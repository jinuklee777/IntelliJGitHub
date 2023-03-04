package map_;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "ana", "mislav"};
        String[] completion = {"stanko", "ana", "mislav"};
        String result = solution(participant, completion);
        System.out.println("결과: " + result);
    }

    static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String part: participant) {
            map.put(part, map.getOrDefault(part, 0)+1);
        }
        System.out.println(map);

        for(String com: completion) {
            map.put(com, map.get(com)-1);
        }
        System.out.println(map);

        for(String key: map.keySet()) {
            if(map.get(key)==1) {
                return key;
            }
        }
        return null;
    }
}
