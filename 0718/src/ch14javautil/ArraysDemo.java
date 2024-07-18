package ch14javautil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {
        // asList(T... a)
        List<Integer> integers = Arrays.asList(4, 6, 8, 12);
        List<String> strings = Arrays.asList("한지민", "홍지민", "박지민", "이지민");

        // sort(int[] array): Dual-Pivot quicksort
        int[] array = {5, 7, 1, 2, 7, 2, 6, 3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        Number[] numbers = new Number[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = new Number(array[i]);
        }
        Arrays.sort(numbers, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                return o1.value - o2.value;
            }
        });
        System.out.println(Arrays.toString(numbers));
    }
}

class Number {
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}