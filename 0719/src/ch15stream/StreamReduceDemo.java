package ch15stream;

import java.util.stream.IntStream;

public class StreamReduceDemo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);

        int total = intStream.reduce(0, (left, right) -> left + right);
        System.out.println(total);
    }
}