package ch07methods;

public class Output {

    void output(Student student) {
        System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
        System.out.println("---------------------------------------------------------");
//        System.out.printf("%-10s\t%5d%5d%5d%5d%7.1f%3c%n",
//                student.getHakbun(), student.getKor(), student.getEng(), student.getMath(), student.getTotal(), student.getAvg(), student.getGrade());
        student.print();
    }
}
