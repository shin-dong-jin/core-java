package ch07methods;

public class CallByValDemo {

    public static void main(String[] args) {
        CallByValDemo demo = new CallByValDemo();
        int money = 1_000;
        String name = "한지민";

        System.out.printf("[Before] money = %d, name = %s%n", money, name);
        demo.change(money, name);
        System.out.printf("[After] money = %d, name = %s%n", money, name);
    }

    void change(int num, String str) { // Call by value
        num *= 5;
        str = "김지민";

        System.out.printf("[In change] money = %d, name = %s%n", num, str);
    }
}
