package ch15lambdastream.lambda;

public class NotReturnLambdaDemo {
    public static void main(String[] args) {
        Person person = new Person();

        // Polymorphic parameter anonymous class
        person.greeting(new Say() {
            @Override
            public void something() {
                System.out.println("I'm Jimin..");
                System.out.println("Nice to meet you!");
            }
        });
        System.out.println();

        // Polymorphic parameter lambda expression
        person.greeting(() -> {
            System.out.println("I'm Jimin..");
            System.out.println("Nice to meet you!");
        });
    }
}

@FunctionalInterface
interface Say {
    void something();
}

class Person {
    public void greeting(Say say) {
        say.something();
    }
}