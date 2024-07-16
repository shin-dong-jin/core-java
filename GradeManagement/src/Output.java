public class Output {
    private Student[] students;

    public Output(Student[] students) {
        this.students = students;
    }

    void output() {
        for(Student student : students) {
            System.out.print(student);
        }
    }
}
