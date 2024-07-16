package ch12polymorphism;

public class OverrideDemo {

    public static void main(String[] args) {
//        Object object = new String("I am String");
        Base base = new Derived();
        base.display();
    }
}

// public > protected > (default) > private
// Override된 자식의 접근제어자는 부모보다 같거나 넓다
class Base {
    public void display() {
        System.out.println("I am Base");
    }
}

class Derived extends Base {
    @Override
    public void display() {
        System.out.println("I am Derived");
    }
}