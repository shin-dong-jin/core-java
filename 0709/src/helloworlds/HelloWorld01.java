package helloworlds;

/*
동일 클래스에 있는 스태틱 변수는 클래스 이름을 생략할 수 있다.
 */
public class HelloWorld01 {
//    String str = "Hello World"; // instance | member variables
    static String str = "Hello World"; // static | class variables

    public static void main(String[] args) {
//        String str = "Hello World"; // local | stack | temporary | auto variables

        System.out.println(Demo01.str);
    }
}

class Demo01 {
    static String str = "Hello Python";
}