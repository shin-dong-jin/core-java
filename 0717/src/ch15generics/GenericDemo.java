package ch15generics;

public class GenericDemo {
    public static void main(String[] args) {
//        Car carnival = new Car(40_000_000);
//        carnival.setPrice(45_000_000);
//        System.out.println(carnival);

        Car<Integer, ?, ?> integerCar = new Car<>(45_000_000);
        Car<String, ?, ?> stringCar = new Car<>("10000000");
        Car<Double, ?, ?> doubleCar = new Car<>(45_000_000.);

        System.out.printf("price = %d%n", integerCar.getPrice());
        System.out.printf("price = %s%n", stringCar.getPrice());
        System.out.printf("price = %f%n", doubleCar.getPrice());
    }
}

// T가 런타임에 자동으로 형변환을 한다 (T -> Integer, Double, Long, ...)
// T: 타입이므로 원시형이 아닌 클래스가 들어감, WrapperClass
class Car<T, U, V> {
    private T price;
    private U name;
    private V maker;

    public Car(T price) {
        this.price = price;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }
}