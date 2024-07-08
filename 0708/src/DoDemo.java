public class DoDemo {

    public static void main(String[] args) {
        // 4! = 4 * 3 * 2 * 1
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String y_n = null; // null 번지
        do {
            System.out.print("몇 Factorial? ");
            int input = scanner.nextInt();
            int n = input;
            int answer = input;
            for(;n > 1;) {
                answer *= --n;
            }
            System.out.println(input + "! = " + answer);

            System.out.println("Again? (y/n)");
            y_n = scanner.next();
        } while(y_n.equalsIgnoreCase("y"));
    }
}
