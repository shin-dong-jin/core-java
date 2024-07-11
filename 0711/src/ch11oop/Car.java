package ch11oop;

public class Car {
    private String name;
    private int price;

    // 기본 생성자
//    public Car() {
//        this.name = null;
//        this.price = 0;
//    }

    public Car(Object ... params) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public Car clone() { // 자동차 복제 (주소 복사)
        return this;
    }
}
