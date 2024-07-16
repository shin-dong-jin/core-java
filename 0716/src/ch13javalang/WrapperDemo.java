package ch13javalang;

// Wrapper: primitive 타입의 객체화(stack -> heap)
public class WrapperDemo {
    public static void main(String[] args) {
        int primitive = 5; // stack에 있는 5
        Integer instance = new Integer(5); // wrapping, boxing: heap에 있는 5
        int instanceToPrimitive = instance.intValue(); // unwrapping, unboxing

        int su = 5;
        Integer integer = su * 100; // Autoboxing
        int another = integer; // Autounboxing
        System.out.println(another);
    }
}
