package ch11oop;

public class ConstructorDemo {

    public static void main(String[] args) {
//        Car sonata = new Car();
//        System.out.println(sonata.getName());
//        System.out.println(sonata.getPrice());


        Product product = new Product();
        Product pencil = new Product("monami pencil", 1_000, "monami");
        Product computer = new Product("notebook", 2_500_000, "LG gram");
        Product tv = new Product("television", 3_000_000, "Samsung Electronics");
    }
}
