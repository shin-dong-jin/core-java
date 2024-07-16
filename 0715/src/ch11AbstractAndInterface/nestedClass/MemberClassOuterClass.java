package ch11AbstractAndInterface.nestedClass;

// member inner class
public class MemberClassOuterClass {
    private static int b = 10; // outer class's static variable
    private int a = 5; // outer class's member variable

    // 내부 클래스는 private 가능
    // member inner class
    private class InnerClass {
        private static int d = 500; // inner class's static variable
        private int c = 100; // inner class's member variable

        // inner class's static method
        public static void print() {
            System.out.println("Inner class's static method");
            MemberClassOuterClass outerClass = new MemberClassOuterClass();
            MemberClassOuterClass.InnerClass innerClass = outerClass.new InnerClass();
            System.out.println(outerClass.a + ", " + b + ", " + innerClass.c + ", " + d);
        }

        // inner class's member method
        public void display() {
            System.out.println("Inner class's member method");
            System.out.println(a + ", " + b + ", " + c + ", " + d);
        }
    }

    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass inner = outer.new InnerClass();

        MemberClassOuterClass.InnerClass inner = new MemberClassOuterClass().new InnerClass();
        System.out.println(inner.c);
        System.out.println(InnerClass.d);
    }
}
