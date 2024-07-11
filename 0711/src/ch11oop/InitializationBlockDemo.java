package ch11oop;

public class InitializationBlockDemo {
    // #1
    private double weight;
    private char grade; // member variables

    // #2
    {
        this.weight = 100.;
        this.grade = 'F';
        System.out.println("나는 초기화 블럭");
    }

    // #3
    public InitializationBlockDemo() { // default constructor's overriding
//        this.weight = 62.4;
//        this.grade = 'C';
        System.out.println("나는 생성자");
    }

    public static void main(String[] args) {
        InitializationBlockDemo demo = new InitializationBlockDemo();
        System.out.println(demo.weight + "kg");
        System.out.println(demo.grade);
    }
}
