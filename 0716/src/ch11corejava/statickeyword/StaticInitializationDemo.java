package ch11corejava.statickeyword;

public class StaticInitializationDemo {
    private int a; // member variable
    private final int B; // member constant
    private static int c; // static variable
    private static final int D; // static constant

    // [initialization block] run once when instance made
    {
        a = 5;
        B = 100;
    }

    // [static initialization block] run only once when class loaded
    static {
        c = 500;
        D = 1_000;
    }

    public static void main(String[] args) {
        System.out.println("c = " + c + ", D = " + D);
    }

    void print() {
        int e; // local variable
        final int F; // local constant
    }
}
