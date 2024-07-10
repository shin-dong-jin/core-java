package ch07methods;

public class VariableArgumentDemo {

    public static void main(String[] args) {
        VariableArgumentDemo demo = new VariableArgumentDemo();
        int a = 5;
        char b = 'B';
        boolean c = true;
        double d = 89.5;
        String e = "한지민";
        demo.print(a, b, c, d, e); // a, b, c, d, e: argument(인자, 인수)
    }

    private void print(Object ... parameters) { // parameter(매개변수)
        System.out.println(parameters.length);

        for(Object parameter : parameters) {
            System.out.println(parameter);
        }
    }
}
