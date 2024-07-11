public class GradeManager {

    public static void main(String[] args) throws java.io.IOException {
        Student[] students = new Student[12];

        Input input = new Input(students);
        input.input();

        Calc calc = new Calc(students);
        calc.calc();

        Output output = new Output(students);
        output.output();

        System.out.println("Program is over...");
    }
}
