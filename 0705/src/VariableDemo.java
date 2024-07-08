public class VariableDemo {
    static int math = 80; // class variable
    int eng = 100; // instance variable

    public static void main(String[] args) {
        int kor = 90; // local variable

        System.out.printf("수학 점수 = %d\n", VariableDemo.math);
        System.out.printf("국어 점수 = %d\n", kor);
//        System.out.printf("영어 점수 = %d\n", eng);

        VariableDemo variableDemo = new VariableDemo();
        System.out.printf("영어 점수 = %d\n", variableDemo.eng);

        Demo demo = new Demo();
        System.out.print((char) 127);
    }
}

class Demo {
    static int math = 70;
    int eng = 50;
}