package ch11corejava.localinnerclass;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
//        LocalInnerClass inner = new LocalInnerClass();
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}

class OuterClass {
    private int a = 5;
    private static int b = 10;

    public void display() {
        int c = 100;
        class LocalInnerClass {
            public void print() {
                System.out.println("a = " + a + ", b = " + b + ", c = " + c); // c: final in LocalInnerClass
            }
        }
        LocalInnerClass inner = new LocalInnerClass();
        inner.print();
    }
}