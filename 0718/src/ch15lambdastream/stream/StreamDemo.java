package ch15lambdastream.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {
        DoubleStream doubleStream = new Random().doubles(3L, 1., 10.);
        doubleStream.forEach(d -> System.out.print(d + ", "));
        System.out.println();

        System.out.println(IntStream.rangeClosed(1, 100).sum());
    }
}
