package helloworlds;

/*
다른 클래스에 있는 스태틱 변수는 속해 있는 클래스 이름으로 접근한다.
*/
public class HelloWorld03 {

    public static void main(String[] args) {
        System.out.println(Demo03.str);
    }
}

class Demo03 {
    static String str = "Hello World"; // static || class variables
}
