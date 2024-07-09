package helloworlds;

/*
동일 클래스에 있는 멤버 변수는 반드시 해당 클래스를 생성해서 그 주소로 접근해야 한다.
*/
public class HelloWorld02 {
    String str = "Hello World"; // member | instance variables

    public static void main(String[] args) {
        HelloWorld02 helloWorld = new HelloWorld02();
        System.out.println(helloWorld.str);
    }
}
