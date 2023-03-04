package list_;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("가"); stack.add("나");
        stack.add("다"); stack.add("라");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
