package ch13javalang;

public class WrapperDemo {

    public static void main(String[] args) {
        // Before JDK 1.5
//        int primitive = 5;
//        Integer integer = new Integer(primitive); // Wrapping, Boxing
//        int primitive2 = integer.intValue(); // Unwrapping, Unboxing
//        System.out.println(primitive2);

        // After JDK 1.5
        int primitive = 5;
        Integer integer = primitive * 100; // Autoboxing
        int primitive2 = integer; // Autounboxing
        System.out.println(primitive2);
    }
}
