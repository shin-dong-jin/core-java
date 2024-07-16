package ch12polymorphism;

/*
Parent: Object
Child: String
 */
public class CastingOverrideDemo {

    public static void main(String[] args) {
        // Casting
        String string = "Hello World";
        Object object = string;

        if(object instanceof String) {
            System.out.println("된다.");
        } else {
            System.out.println("안된다.");
        }
        String target = (String) object;
        System.out.println(target);

        System.out.println("==============================");

        // Override
        Child child = new Child();
        Parent parent = new Parent();
        parent = child;
        parent.display();
    }
}

class Parent {
    public void display() {
        System.out.println("나는 부모 메소드");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("나는 자식 메소드");
    }
}