package ch11corejava.anonymousobject;

public class AnonymousClassDemo {
    public static void main(String[] args) {
//        Canine dog = new Dog();
//        dog.roam();
//        dog.bark();

        Canine canine = new Canine() {
            @Override
            void bark() {
                System.out.println("BAAAARK");
            }

            void display() {
                System.out.println("DISPLAY");
            }
        };

        canine.bark();
        canine.roam();
//        canine.display();
    }
}

abstract class Canine {
    abstract void bark();

    void roam() {
        System.out.println("ROAM");
    }
}

//class Dog extends Canine {
//    @Override
//    void bark() {
//        System.out.println("BARK!");
//    }
//}