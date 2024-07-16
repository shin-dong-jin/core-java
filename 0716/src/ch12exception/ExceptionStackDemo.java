package ch12exception;

public class ExceptionStackDemo {

    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        try {
            c();
        } catch (ArithmeticException e) {
            System.out.println("b() caught an ArithmeticException");
        }
    }

    private static void c() {
        d();
    }

    private static void d() {
        throw new ArithmeticException();
    }
}
