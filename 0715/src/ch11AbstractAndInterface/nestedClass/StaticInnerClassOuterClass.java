package ch11AbstractAndInterface.nestedClass;

// static inner class
public class StaticInnerClassOuterClass {
    private static int b = 10; // outer class's static variable
    private int a = 5; // outer class's member variable

    // 내부 클래스는 private 가능
    // member inner class
    private static class InnerClass1 {
        private static int d = 500; // static inner class's static variable
        private int c = 100; // static inner class's member variable

        // static inner class's static method
        public static void print() {
            System.out.println("Static inner class's static method");
            StaticInnerClassOuterClass outerClass = new StaticInnerClassOuterClass();
            StaticInnerClassOuterClass.InnerClass1 innerClass = new StaticInnerClassOuterClass.InnerClass1();
            System.out.println(outerClass.a + ", " + b + ", " + innerClass.c + ", " + d);
        }

        // inner class's member method
        public void display() {
            System.out.println("Static inner class's member method");

            StaticInnerClassOuterClass outer = new StaticInnerClassOuterClass();
            System.out.println(outer.a + ", " + b + ", " + c + ", " + d);
        }
    }

    public static void main(String[] args) {
        StaticInnerClassOuterClass.InnerClass1 innerClass = new StaticInnerClassOuterClass.InnerClass1();
        innerClass.display();
        InnerClass1.print();
    }
}
