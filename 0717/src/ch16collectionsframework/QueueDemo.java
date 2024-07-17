package ch16collectionsframework;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        String[] elements = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};
        Queue<String> queue = new LinkedList<>(List.of(elements));
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
