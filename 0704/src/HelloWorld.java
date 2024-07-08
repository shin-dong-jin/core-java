public class HelloWorld {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("당신의 이름은? ");
        String name = scanner.nextLine();
        System.out.printf("귀하의 이름은 %s입니다.\n", name);
        scanner.close();
    }
}