package ch15lambdastream.stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
    Map에 저장된 Key를 이용하여 각 Value 출력하기
 */
public class MapForEachDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Language", "Java");
        map.put("DB", "MySQL");
        map.put("Framework", "Spring Boot");
        map.put("Frontend", "React");
        map.put("Cloud", "AWS");

        // 1. Iterator
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(key + " => " + map.get(key));
        }
        System.out.println("=======================");

        // 2. map.forEach()
        map.forEach((key, value) -> System.out.println(key + " => " + value));
        System.out.println("=======================");

        // 3. Entry
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        System.out.println("=======================");

        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
