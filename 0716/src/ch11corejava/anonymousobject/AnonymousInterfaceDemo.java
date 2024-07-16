package ch11corejava.anonymousobject;

public class AnonymousInterfaceDemo {
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("FLY");
            }

            @Override
            public void roam() {
                System.out.println("ROAM");
            }
        };
        bird.fly();
        bird.roam();
    }
}

interface Bird {
    void fly();
    void roam();
}