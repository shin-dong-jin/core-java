public class MethodCallByValueCopyDemo {

    public static void main(String[] args) {
        MethodCallByValueCopyDemo methodCallByValueCopyDemo = new MethodCallByValueCopyDemo();
        int original = 100;
        methodCallByValueCopyDemo.print(original);
        System.out.println("original = " + original);
    }

    void print(int param) {
        System.out.println("param = " + param);
        param = 50_000;
        System.out.println("param = " + param);
    }
}
