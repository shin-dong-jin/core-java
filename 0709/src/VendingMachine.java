public class VendingMachine {

    public static void main(String[] args) {
        int[] money = {50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10, 5, 1};
        int[] count = new int[10];

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String continueYN = null;

        do {
            System.out.print("Money: ");
            int inputMoney = scanner.nextInt();

            for (int i = 0; i < 10; i++) {
                count[i] = inputMoney / money[i];
                inputMoney = inputMoney % money[i];
            }

            for (int i = 0; i < 10; i++) {
                System.out.printf("%d원: %d\n", money[i], count[i]);
            }

            System.out.print("Again(y/n)? ");
            continueYN = scanner.next();
        } while(continueYN.equalsIgnoreCase("y"));

        System.out.println("Program is over...");

        scanner.close();
    }
}
