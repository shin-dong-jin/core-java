package ch11AbstractAndInterface.packagePractice;

import ch11AbstractAndInterface.packagePractice.com.example.libs.Car;

public class CarImportDemo extends Car {
    public static void main(String[] args) {
        Car sonata = new Car();

        // public
        System.out.println(sonata.name);

        // protected
        CarImportDemo demo = new CarImportDemo();
        System.out.println(demo.price);
    }
}
