package helloworlds;

/*
다른 클래스에 있는 멤버 변수는 속해 있는 클래스를 생성하고 그 주소로 접근한다.
*/
public class HelloWorld04 {

    public static void main(String[] args) {
        Demo04 demo = new Demo04();
        System.out.println(demo.str);
    }
}

class Demo04 {
    String str = "Hello World"; // member | instance variable
}