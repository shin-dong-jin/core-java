package ch11AbstractAndInterface.nestedClass;

// Local inner class
public class LocalClassOuterClass {
    public static void main(String[] args) {
        LocalClassOuterClass outerClass = new LocalClassOuterClass();
        outerClass.display();
    }

    private void display() {
        int a = 5; // local variables

        // local class
        class LocalClass {
            static int c = 500; // Local inner class's static variables
            int b = 100; // Local inner class's member variables

            static void display() {
                System.out.println("Local class static method");
            }

            void print() {
                System.out.println("Local class member method");
            }
        }

        LocalClass localClass = new LocalClass();
        System.out.println(a);
        System.out.println(localClass.b);
        System.out.println(LocalClass.c);
        LocalClass.display();
        localClass.print();
    }
}
