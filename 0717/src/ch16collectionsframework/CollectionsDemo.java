package ch16collectionsframework;

import java.util.*;

/*
bulk로 데이터를 추출할 때: Iterator, Enumeration
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        String[] elements = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};

        // Set: Iterator
        Set<String> set = new HashSet<String>(List.of(elements));
        for(String element : elements) {
            set.add(element);
        }

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        // Vector: Enumeration
        Vector<String> vector = new Vector<>(List.of(elements));
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + ", ");
        }
        System.out.println();
    }
}