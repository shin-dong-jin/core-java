package helloworlds;

/*
다른 클래스의 스태틱 메소드는 클래스 이름으로 접근한다.
 */
public class HelloWorld07 {
    public static void main(String[] args) {
        Demo07.printHelloWorld();
    }
}

class Demo07 {
    static void printHelloWorld() {
        System.out.println("Hello World");
    }
}