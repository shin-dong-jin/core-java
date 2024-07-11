public class Input {
    private java.util.Scanner scanner;
    private Student[] students;

    public Input(Student[] students) throws java.io.IOException {
        this.scanner = new java.util.Scanner(new java.io.File("./sungjuk_utf8.txt")).useDelimiter("\\s+");
        this.students = students;
    }

    void input() {
        for (int i = 0; i < students.length; i++) {
            /* 문자열 파싱
                string.split(정규식)
                scanner.useDelimiter(정규식)
             */
            students[i] = new Student(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
    }
}
