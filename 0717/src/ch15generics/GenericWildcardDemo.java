package ch15generics;

import java.util.Vector;

public class GenericWildcardDemo {
    public static void main(String[] args) {
        // 객체는 형변환 가능
        Object object = "Hello";
        // 제너릭은 형변환 불가
//        java.util.Vector<Object> vector = new java.util.Vector<String>();

        java.util.Vector typeErasedVector = new java.util.Vector();
        typeErasedVector.add(1);
        typeErasedVector.add("3abc");
        System.out.println(typeErasedVector);

        Vector<? super Object> stringVector = new Vector<>();
        stringVector.add(5);

//        Product<Integer> pencil = new Product<>(1_000);
//        Product<Double> ballpen = new Product<>(100.);
//        Product<Object> objs = new Product<Object>(); // T extends Number



        /*
        Wildcard
        super인 경우에는 실체형을 따라가고,
        extends인 경우에는 선언형을 따라간다.
        ?는 Object형을 따라간다.
         */
        Product<?> wildcard = new Product<>("aab1");
        System.out.println(wildcard);

        Product<? super Number> productSuperNumber = new Product<>("3044");
        System.out.println(productSuperNumber);

        Product<? extends Number> productExtendsNumber = new Product<>(10.);
        System.out.println(productExtendsNumber.getPrice());

        java.util.List<Car> list = new java.util.ArrayList<>();
    }
}

class Product<T extends Object> {
    private T price;

    public Product(T price) {
        this.price = price;
    }

    public T getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.valueOf(price);
    }
}