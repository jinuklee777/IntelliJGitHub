package list_;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(1); que.add(2); que.add(3); que.add(4);
        while (que.size() > 0) {
            System.out.println(que.poll());
        }
    }
}
