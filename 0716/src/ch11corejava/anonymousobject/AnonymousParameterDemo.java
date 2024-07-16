package ch11corejava.anonymousobject;

public class AnonymousParameterDemo {
    public static void main(String[] args) {
        AnonymousParameterDemo demo = new AnonymousParameterDemo();

//        Mammal dog = new Dog();
//        demo.display(dog);

        // 파라미터에만 사용되고 제거되는 일회성 익명객체
        // 재선언 불가
        demo.display(new Mammal() {
            @Override
            public void sound() {
                System.out.println("SOUND");
            }
        });
    }

    void display(Mammal mammal) {
        mammal.sound();
    }
}

interface Mammal {
    void sound();
}

class Dog implements Mammal {
    @Override
    public void sound() {
        System.out.println("BARK");
    }
}