package ch11oop;

public class Product {
    String name, maker;
    int price;

    /* Default Constructor */
    public Product() {
        this.name = null;
        this.maker = null;
        this.price = 0;
    }

    /* Constructor */
    public Product(String name, int price, String maker) {
        this.name = name;
        this.maker = maker;
        this.price = price;
    }
}
