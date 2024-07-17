package ch16collectionsframework;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        String[] elements = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Stack<String> stack = new Stack<>();
        for (String element : elements) {
            stack.push(element);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
