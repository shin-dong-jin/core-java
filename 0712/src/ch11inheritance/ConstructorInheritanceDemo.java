package ch11inheritance;

/* 부모 생성자는 상속되지 않는다. */
public class ConstructorInheritanceDemo {
    public static void main(String[] args) {
        Sonata sonata = new Sonata("EF Sonata", 30_000_000);
    }
}

class Car {
    String name;
    int price;

    public Car() {

    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class Sonata extends Car {
    int price;

    // 자식 생성자는 부모의 기본 생성자만 호출한다.
    // 부모의 다른 생성자를 호출 할 때 super 메소드 사용
    public Sonata(String name, int price) {
        // super()는 자식 생성자에서 임의로 부모 생성자를 호출할 때 사용한다.
        // 반드시 생성자 안에서만 사용해야하고, 생성자 안에서 반드시 첫번째 줄에 위치해야한다.
        super(name, price);
        this.price = price;
        System.out.println("나는 자식의 생성자");
    }

    public Sonata(int price) {
        this.price = price;
    }
}