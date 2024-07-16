package ch12polymorphism;

// 객체 형변환 + 오버라이드 메소드
public class PolymorphismDemo {
    public static void main(String[] args) {
        PolymorphismDemo demo = new PolymorphismDemo();
        Mammal mammal = new Mammal();

        for (int i = 0; i < 3; i++) {
            int choice = demo.choose();

            switch (choice) {
                case 1:
                    mammal = new Dog();
                    break;
                case 2:
                    mammal = new Cat();
                    break;
                case 3:
                    mammal = new American();
                    break;
                case 4:
                    mammal = new Korean();
                    break;
            }

            mammal.saySomething();
        }
    }

    private int choose() {
        System.out.println("********Menu********");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. American");
        System.out.println("4. Korean");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("당신은 어느 종족입니까?(1 ~ 4) ");
        return scanner.nextInt();
    }
}

class Mammal {
    public void saySomething() {
        
    }
}

class Dog extends Mammal {
    @Override
    public void saySomething() {
        System.out.println("멍멍멍멍");
    }
}

class Cat extends Mammal {
    @Override
    public void saySomething() {
        System.out.println("야옹야옹");
    }
}

class American extends Mammal {
    @Override
    public void saySomething() {
        System.out.println("Good afternoon!");
    }
}

class Korean extends Mammal {
    @Override
    public void saySomething() {
        System.out.println("안녕하세요.");
    }
}