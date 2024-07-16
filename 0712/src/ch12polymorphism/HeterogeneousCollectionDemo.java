package ch12polymorphism;


public class HeterogeneousCollectionDemo {

    public static void main(String[] args) {
//        Dog[] dogs = new Dog[10];
//        dogs[0] = new Cat();

        Mammal[] mammals = new Mammal[4];
        mammals[0] = new Dog();
        mammals[1] = new Cat();
        mammals[2] = new American();
        mammals[3] = new Korean();

        for(Mammal mammal : mammals) {
            mammal.saySomething();
        }
    }
}
