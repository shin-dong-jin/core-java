package ch07methods;

public class Calc {

    void calc(Student student) {
        student.setTotal(student.getKor() + student.getEng() + student.getMath());
        student.setAvg(student.getTotal() / 3.);
        double avg = student.getAvg();
        student.setGrade(avg >= 90 ? 'A' : avg >= 80 ? 'B' : avg >= 70 ? 'C' : avg >= 60 ? 'D' : 'F');
    }
}
