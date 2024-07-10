package ch07methods;

public class Input {

    void input(Student student) { // student = younghee, Call by reference
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("학번: ");
        student.setHakbun(scanner.next());

        System.out.print("국어: ");
        student.setKor(scanner.nextInt());

        System.out.print("영어: ");
        student.setEng(scanner.nextInt());

        System.out.print("수학: ");
        student.setMath(scanner.nextInt());
    }
}
