package ch15stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
    filter, map, distinct, limit, sorted: 중간연산
    count, sum, max, min, average, reduce, forEach: 최종연산
 */
public class StreamFilterDemo {
    public static void main(String[] args) {
        String[] array = {"abc", "Hello", "hi", "Java Language"};
        Stream<String> generated = Stream.of(array);
        Stream<String> middle = generated.filter(str -> str.length() >= 5);
        String[] result = middle.toArray(String[]::new);
        System.out.println(Arrays.toString(result));
        System.out.println();

        List<Customer> customers = List.of(
                new Customer("한지민", 28),
                new Customer("김지민", 38),
                new Customer("박지민", 48),
                new Customer("홍지민", 58)
        );
        Stream<Customer> customerStream = customers.stream();
        customerStream.map(Customer::getName).forEach(System.out::println);
    }
}

class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}