package ch15stream;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        int sum = intStream.sum();
        long count = IntStream.rangeClosed(1, 100).count();
        System.out.println(sum + ", " + count);

        // 1.0 ~ 100.0까지 난수 15개 중 최대값은?
        OptionalDouble max = new Random().doubles(1., 100.).distinct().limit(15).max();
        System.out.println(max.getAsDouble());
    }
}
