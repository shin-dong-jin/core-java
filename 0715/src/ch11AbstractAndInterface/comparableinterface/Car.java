package ch11AbstractAndInterface.comparableinterface;

public class Car implements Comparable<Car> {
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /* Comparable의 compareTo() 재정의
    내가 other를 뺀다.
    내가 other보다 크다 = 1(양수)
    나와 other가 같다 = 0
    내가 other보다 작다 = -1(음수)
     */
    @Override
    public int compareTo(Car other) {
        return this.price - other.price;
    }
}
