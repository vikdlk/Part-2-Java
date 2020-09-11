package _03Collections._04VectorStack;

import java.util.Stack;

public class StackExm2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Viktor");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katia");
        System.out.println(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
