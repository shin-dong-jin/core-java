package ch16collectionsframework;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/*
Set은 중복을 허용하지 않는다.
 */
public class SetDemo {
    public static void main(String[] args) {
        String[] elements = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};

        // HashSet: sorting X
        Set<String> hashSet = new HashSet<>();
        for(String element : elements) {
            hashSet.add(element);
        }
        System.out.println("HashSet: " + hashSet);

        // TreeSet: sorting O
        Set<String> treeSet = new TreeSet<>();
        for(String element : elements) {
            treeSet.add(element);
        }
        System.out.println("TreeSet: " + treeSet);
    }
}
