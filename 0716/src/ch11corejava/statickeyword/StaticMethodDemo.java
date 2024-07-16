package ch11corejava.statickeyword;

/*
init() -> b -> main() -> a, display() by constructor
 */
public class StaticMethodDemo {
    private int a; // member variables
    private static int b = init(); // static variables

    public static void main(String[] args) {
        System.out.println("MAIN METHOD");
    }

    // member method
    void display() {

    }


    // static method
    static int init() {
        System.out.println("STATIC METHOD");
        return 30_000_000;
    }
}