public class SungjukManagement {

    public static void main(String[] args) {
        Student chulsu = new Student();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String continueYN = null;
        do {
            System.out.print("학번: ");
            chulsu.hakbun = scanner.next();
            System.out.print("국어: ");
            chulsu.kor = scanner.nextInt();
            System.out.print("영어: ");
            chulsu.eng = scanner.nextInt();
            System.out.print("수학: ");
            chulsu.math = scanner.nextInt();
            chulsu.total = chulsu.kor + chulsu.eng + chulsu.math;
            chulsu.avg = chulsu.total / 3.;
            chulsu.grade = '\u0000';
            switch ((int) (chulsu.avg / 10)) {
                case 10:
                case 9:
                    chulsu.grade = 'A';
                    break;
                case 8:
                    chulsu.grade = 'B';
                    break;
                case 7:
                    chulsu.grade = 'C';
                    break;
                case 6:
                    chulsu.grade = 'D';
                    break;
                default:
                    chulsu.grade = 'F';
            }

            System.out.printf("%10s\t%5d\t%5d\t%5d\t%5d\t%10.1f\t%3c%n",
                    chulsu.hakbun, chulsu.kor, chulsu.eng, chulsu.math, chulsu.total, chulsu.avg, chulsu.grade);

            System.out.print("Again? (y/n): ");
            continueYN = scanner.next();
        } while (continueYN.equalsIgnoreCase("y"));

        System.out.println("Program is over...");
        scanner.close();
    }
}
