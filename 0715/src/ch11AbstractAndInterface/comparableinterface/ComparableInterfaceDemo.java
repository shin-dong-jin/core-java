package ch11AbstractAndInterface.comparableinterface;

public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        Car sonata = new Car("EF Sonata", 30_000_000);
        Car matiz = new Car("Red Matiz", 10_000_000);

        // sonata - matiz
        int result = sonata.compareTo(matiz);
        System.out.println(result);
    }
}
