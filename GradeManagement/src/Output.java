public class Output {
    private Student[] students;

    public Output(Student[] students) {
        this.students = students;
    }

    void output() {
        for(Student student : students) {
            System.out.printf("%-5s\t%7s\t%5d\t%5d\t%5d\t%5d\t%5d\t%8.1f\t%5c%n",
                    student.getStudentID(), student.getName(), student.getKor(), student.getEng(),
                    student.getMath(), student.getEdp(), student.getTotal(), student.getAvg(), student.getGrade());
        }
    }
}
