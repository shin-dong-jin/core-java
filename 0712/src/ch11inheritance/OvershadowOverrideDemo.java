package ch11inheritance;

/* Overshadow 변수 Override 메소드는 상속되지 않는다. */
public class OvershadowOverrideDemo {

    public static void main(String[] args) {
        Horse horse = new Horse();
        System.out.println(horse);
    }
}

class Mammal extends Object {
    public void display() {
        System.out.println("나는 포유류");
    }
}

class Horse extends Mammal {
    @Override
    public void display() {
        System.out.println("나는 제주말이야");
    }

    @Override
    public String toString() {
        return "나는 제주말입니다.";
    }
}