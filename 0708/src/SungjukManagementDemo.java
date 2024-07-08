public class SungjukManagementDemo {

    public static void main(String[] args) {
        Student[] students = new Student[2]; // Initialization
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            students[i] = new Student(); // Make instance of reference element

            System.out.print("학번: ");
            students[i].hakbun = scanner.next();

            System.out.print("국어: ");
            students[i].kor = scanner.nextInt();

            System.out.print("영어: ");
            students[i].eng = scanner.nextInt();

            System.out.print("수학: ");
            students[i].math = scanner.nextInt();

            students[i].total = students[i].kor + students[i].eng + students[i].math;
            students[i].avg = students[i].total / 3.;

            switch ((int) (students[i].avg / 10.)) {
                case 10: case 9:
                    students[i].grade = 'A';
                    break;
                case 8:
                    students[i].grade = 'B';
                    break;
                case 7:
                    students[i].grade = 'C';
                    break;
                case 6:
                    students[i].grade = 'D';
                    break;
                default:
                    students[i].grade = 'F';
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f\t%3c%n",
                    students[i].hakbun, students[i].kor, students[i].eng, students[i].math, students[i].total, students[i].avg, students[i].grade);
        }

        scanner.close();
    }
}
