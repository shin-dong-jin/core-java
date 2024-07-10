package ch07methods;

public class CallByRefDemo {

    public static void main(String[] args) {
        Student younghee = new Student();

//        CallByRefDemo demo = new CallByRefDemo();
        new Input().input(younghee);
        new Calc().calc(younghee);
        new Output().output(younghee);
    }
}
