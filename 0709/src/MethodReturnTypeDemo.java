public class MethodReturnTypeDemo {

    public static void main(String[] args) {
        MethodReturnTypeDemo demo = new MethodReturnTypeDemo();
        demo.print();
    }

    String print() {
        int val = 5;
        System.out.println("Hello World");
        if (val % 2 == 0) {
            return "RETURN";
        }
        System.out.println("MISSING RETURN STATEMENT");
        return "RETURN";
//        System.out.println("UNREACHABLE STATEMENT");
    }
}
