package ch15lambdastream.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Stream 생성
        배열을 이용할 것인가, 아니면 Collection을 이용할 것인가에 따라 약간 다르다.
 */
public class GenerateStreamDemo {
    public static void main(String[] args) {
        // 1. Array to Stream: Stream.of()
        Integer[] intArray = {1, 2, 3, 4, 5};
        Stream<Integer> integerStream = Stream.of(intArray);

        String[] stringArray = {"사과", "배", "딸기", "복숭아", "레몬", "망고", "수박"};
        Stream<String> stringStream = Stream.of(stringArray);

        // 2. Array to Stream: Arrays.stream()
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5});
        Stream<String> stringStream2 = Arrays.stream(new String[] {"사과", "배", "딸기", "복숭아", "레몬", "망고", "수박"});

        // 3. Collection to Stream: collection.stream()
        List<String> stringList = Arrays.asList("사과", "배", "딸기", "복숭아", "레몬", "망고", "수박");
        Stream<String> stringStream3 = stringList.stream();

        List<Integer> integerList = List.of(3, 4, 7, 1, 2, 3);
        Stream<Integer> integerStream3 = integerList.stream();

        Set<String> stringSet = Set.of("사과", "배", "딸기", "복숭아", "레몬", "망고", "수박");
        Stream<String> stringStream4 = stringSet.stream();

        // 4. Stream set range
        IntStream integerStream4 = IntStream.range(1, 11);
        DoubleStream doubleStream = DoubleStream.of(10.5);

        // 5. Generate Random number stream
        DoubleStream randomDoubleStream = new Random().doubles(15L, 1., 10.);
        IntStream randomIntStream = new Random().ints(5L, 1, 10);
    }
}
