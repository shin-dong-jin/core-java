public class Calc {
    private Student[] students;

    public Calc(Student[] students) {
        this.students = students;
    }

    void calc() {
        for(Student student : students) {
            int total = student.getKor() + student.getEng() + student.getMath() + student.getEdp();
            double avg = total / 4.;
            char grade = avg >= 90. ? 'A' :
                            avg >= 80. ? 'B' :
                                    avg >= 70 ? 'C' :
                                            avg >= 60 ? 'D' : 'F';
            student.setTotal(total);
            student.setAvg(avg);
            student.setGrade(grade);
        }
    }
}
