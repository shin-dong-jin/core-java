package ch13oop;

public class AbstractDemo {

    public static void main(String[] args) {
        Tiger tiger = new Lion();
        tiger.display();
    }
}

abstract class Tiger {
    public abstract void display();

    public void print() {
        System.out.println("나는 정상적인 메소드");
    }
}

class Lion extends Tiger {
    @Override
    public void display() {
        System.out.println("I am Lion.");
    }
}