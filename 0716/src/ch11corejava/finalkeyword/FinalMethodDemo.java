package ch11corejava.finalkeyword;

public class FinalMethodDemo {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}

class Parent {
    public final void display() {
        System.out.println("PARENT");
    }
}

class Child extends Parent {
//    @Override
//    public void display() {
//        System.out.println("CHILD");
//    }
}