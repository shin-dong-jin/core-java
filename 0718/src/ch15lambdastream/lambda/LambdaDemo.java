package ch15lambdastream.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        // Implements MyInterface
        int left = 5, right = 10;
        SubClass sub = new SubClass();
        int result = sub.add(left, right);
        System.out.println("result = " + result);
        System.out.println();

        // Anonymous class of MyInterface
        MyInterface myInterface = new MyInterface() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("result = " + myInterface.add(left, right));
        System.out.println();

        // Lambda Expression
        MyInterface lambda = (a, b) -> a + b;
        System.out.println("result = " + lambda.add(left, right));
    }
}

@FunctionalInterface
interface MyInterface {
    int add(int a, int b);
}

class SubClass implements MyInterface {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}