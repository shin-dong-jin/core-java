import java.util.Scanner;

public class OpDemo {
    public static final int SIXTY = 60;

    public static void main(String[] args) {
//        short su = 5;
//        short result = ~su;
//        System.out.printf("%d", result);

//        short result = true ? 1970 : 3.14; // 값 먼저, 조건 나중

        Scanner scanner = new Scanner(System.in);
        System.out.print("값 입력(초단위): ");
        int input = scanner.nextInt();

        int seconds = input % SIXTY;
        int minutes = input / SIXTY % SIXTY;
        int hours = input / (SIXTY * SIXTY);

        String output = (input + "초는 ")
                + (hours == 0 ? "" : hours + "시간 ")
                + (minutes == 0 ? "" : minutes + "분 ")
                + (seconds == 0 ? "" : seconds + "초 ")
                + "입니다.";

        System.out.println(output);

        scanner.close();
    }
}
