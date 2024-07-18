package ch15lambdastream.stream;

import java.util.Arrays;
import java.util.List;

public class ListForEachDemo {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과", "배", "딸기", "복숭아", "레몬", "망고", "수박");

        // 1. for
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + ", ");
        }
        System.out.println();

        // 2. enhanced for
        for(String fruit : fruits) {
            System.out.print(fruit + ", ");
        }
        System.out.println();

        // forEach
        fruits.forEach(str -> System.out.print(str + ", "));
    }
}
