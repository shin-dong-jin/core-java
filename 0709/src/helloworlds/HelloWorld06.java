package helloworlds;

/*
동일 클래스의 멤버 메소드는 해당 클래스를 생성하고 그 주소로 접근해야 한다.
*/
public class HelloWorld06 {

    public static void main(String[] args) {
        HelloWorld06 helloWorld = new HelloWorld06();
        helloWorld.printHelloWorld();
    }

    void printHelloWorld() { // member | instance methods
        System.out.println("Hello World");
    }
}
