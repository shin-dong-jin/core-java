package ch15stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
    java.lang.IllegalStateException 발생 이유
        한 번 사용한 Stream은 재사용할 수 없는 일회성 객체이기 때문이다.
        따라서 필요하다면 다시 생성해야 한다.
 */
public class StreamExceptionDemo {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100); // Stream 생성
        int sum = intStream.sum(); // 최종연산
//        long count = intStream.count(); // 최종연산: IllegalStateException

        // 1부터 100 사이에 난수를 발생하여 중복을 배제하고 5개를 추출하여 소팅까지 수행하자
        IntStream sortedIntStream = new Random().ints(1, 100).distinct().limit(5L).sorted();
        System.out.println(Arrays.toString(sortedIntStream.toArray()));
    }
}
