package ch16collectionsframework;

import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

/*
List: 중복 허용, 인덱스로 접근
 */
public class ListDemo {
    public static void main(String[] args) {
        String[] elements = {"한지민", "박지민", "홍지민", "한지민", "홍지민", "신지민", "곽지민"};

        // ArrayList
        List<String> list = new ArrayList<>(5);
        for(String element : elements) {
            list.add(element);
        }
        System.out.println("현재 방갯수: " + list.size());
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(1));

        // Vector
        List<String> vector = new Vector<>(1, 1);
    }
}
