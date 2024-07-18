package ch15lambdastream.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    Collections framework & Lambda
 */
public class CollectionLambdaDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 7, 1, 2, 9, 3, 5);

        // Collections.sort(Collection<T> target, Comparator<T> comparator)
        // Comparator: Anonymous class
        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);

        // Comparator: Lambda
        Collections.sort(integers, (Integer o1, Integer o2) -> o2 - o1);
        System.out.println(integers);

        // Comparator: Comparator.reverseOrder()
        Collections.sort(integers, Comparator.reverseOrder());
        System.out.println(integers);

        // Comparator: Comparator.naturalOrder()
        Collections.sort(integers, Comparator.naturalOrder());
        System.out.println(integers);

        List<String> strings = Arrays.asList("한강", "두만강", "낙동강", "압록강", "영산강", "금강");
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
        System.out.println(strings);
    }
}
