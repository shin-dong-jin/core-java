package ch15lambdastream.lambda;

public class MultiParamReturnLambdaDemo {
    public static void main(String[] args) {
        Person4 person = new Person4();

        // Polymorphic parameter anonymous class
        person.greeting(new Say4() {
            @Override
            public int something(int left, int right) {
                System.out.println("I'm Jimin..");
                System.out.println("Nice to meet you!");
                return left * right;
            }
        });
        System.out.println();

        // Polymorphic parameter lambda expression
        person.greeting((left, right) -> {
            System.out.println("I'm Jimin..");
            System.out.println("Nice to meet you!");
            return left + right;
        });
    }
}

@FunctionalInterface
interface Say4 {
    int something(int left, int right);
}

class Person4 {
    public void greeting(Say4 say) {
        System.out.println(say.something(5, 10));
    }
}
