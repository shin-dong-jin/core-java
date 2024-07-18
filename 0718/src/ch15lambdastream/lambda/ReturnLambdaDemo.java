package ch15lambdastream.lambda;

public class ReturnLambdaDemo {
    public static void main(String[] args) {
        Person1 person = new Person1();

        // Polymorphic parameter anonymous class
        person.greeting(new ReturnInterface() {
            @Override
            public int something() {
                System.out.println("I'm Jimin..");
                System.out.println("Nice to meet you!");
                return 100;
            }
        });
        System.out.println();

        // Polymorphic parameter lambda expression
        person.greeting(() -> {
            System.out.println("I'm Jimin..");
            System.out.println("Nice to meet you!");
            return 200;
        });
    }
}

@FunctionalInterface
interface ReturnInterface {
    int something();
}

class Person1 {
    public void greeting(ReturnInterface say) {
        System.out.println(say.something());
    }
}