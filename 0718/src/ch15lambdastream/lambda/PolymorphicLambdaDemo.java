package ch15lambdastream.lambda;

public class PolymorphicLambdaDemo {
    public static void main(String[] args) {
        int a = 5, b = 10;
        // Anonymous class of Comparable interface
        Comparable anonymous = new Comparable() {
            @Override
            public int compare(int left, int right) {
                return left - right;
            }
        };
        System.out.println(anonymous.compare(a, b));
        System.out.println();

        // Lambda expression
        Comparable lambda = (left, right) -> left - right;
        System.out.println(lambda.compare(a, b));
        System.out.println();

        // Anonymous class polymorphic parameter
        calculator(new Comparable() {
            @Override
            public int compare(int left, int right) {
                return left - right;
            }
        });

        // Lambda expression polymorphic parameter
        calculator((left, right) -> left - right);
    }

    private static void calculator(Comparable comparable) {
        int left = 5, right = 10;
        int result = comparable.compare(left, right);
        System.out.println(result);
        System.out.println();
    }
}

@FunctionalInterface
interface Comparable {
    int compare(int left, int right);
}