package ch11AbstractAndInterface.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        // interface도 추상클래스처럼 인스턴스화 불가능
//        Mammal mammal = new Mammal();

//        Mammal dog = new Dog();
//        dog.display();
//        Mammal cat = new Cat();
//        cat.display();

        // heterogeneous collection
        InterfaceMammal[] mammals = new InterfaceMammal[2];
        mammals[0] = new Dog();
        mammals[1] = new Cat();
        for(InterfaceMammal mammal : mammals) {
            mammal.display();
        }
    }
}

//public class InterfaceDemo implements InterfaceMammal {
//    @Override
//    public void display() {
//        System.out.println("implemented Mammal");
//    }
//
//    public static void main(String[] args) {
//        Mammal interfaceDemo = new InterfaceDemo();
//        System.out.println(interfaceDemo.PI);
//        interfaceDemo.display();
//
//        // 상수는 불변
////        interfaceDemo.PI = 3.15;
//    }
//}

// 3. interface 구현 시 implements 키워드 사용
class Dog implements InterfaceMammal {
    // 4. interface 추상메소드를 재정의시 접근제어자는 반드시 public
    @Override
    public void display() {
        System.out.println("개에 맞게 재정의된 메소드");
    }
}

class Cat implements InterfaceMammal {
    @Override
    public void display() {
        System.out.println("고양이에 맞게 재정의된 메소드");
    }
}