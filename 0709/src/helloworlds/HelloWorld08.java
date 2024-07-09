package helloworlds;

/*
다른 클래스의 멤버 메소드는 클래스를 생성하고 그 주소로 접근한다.
 */
public class HelloWorld08 {

    public static void main(String[] args) {
        Demo08 demo = new Demo08();
        demo.printHelloWorld();
    }
}

class Demo08 {
    void printHelloWorld() {
        System.out.println("Hello World");
    }
}