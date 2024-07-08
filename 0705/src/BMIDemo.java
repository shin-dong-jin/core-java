public class BMIDemo {

    public static void main(String[] args) {
        // 입력: scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("신장(cm): ");
        double height = scanner.nextDouble() / 100.;
        System.out.print("몸무게(kg): ");
        double weight = scanner.nextDouble();

        // 연산
        double bmi = weight / (height * height);
        bmi = (int) (10. * bmi + 0.5) / 10.;

        String level = "";

        if (bmi < 18.5) {
            level = "저체중";
        } else if (18.5 <= bmi && bmi <= 22.9) {
            level = "정상";
        } else if (23 <= bmi && bmi <= 24.9) {
            level = "비만전단계";
        } else if (25 <= bmi && bmi <= 29.9) {
            level = "1단계 비만";
        } else if (30 <= bmi && bmi <= 34.9) {
            level = "2단계 비만";
        } else if (35 <= bmi) {
            level = "3단계 비만";
        }

        // 출력
        String output = name + "님은 BMI지수 " + bmi + "이고 " + level + "입니다.";

        System.out.println("---------------");
        System.out.println(output);

        scanner.close();
    }
}
