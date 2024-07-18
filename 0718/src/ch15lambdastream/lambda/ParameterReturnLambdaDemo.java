package ch15lambdastream.lambda;

public class ParameterReturnLambdaDemo {
    public static void main(String[] args) {
        Person3 person = new Person3();

        // Polymorphic parameter anonymous class
        person.greeting(new Say3() {
            @Override
            public int something(int param) {
                System.out.println("I'm Jimin..");
                System.out.println("Nice to meet you!");
                return param * 10;
            }
        });
        System.out.println();

        // Polymorphic parameter lambda expression
        person.greeting(param -> {
            System.out.println("I'm Jimin..");
            System.out.println("Nice to meet you!");
            return param * 100;
        });
    }
}

@FunctionalInterface
interface Say3 {
    int something(int param);
}

class Person3 {
    public void greeting(Say3 say) {
        System.out.println(say.something(5));
    }
}
