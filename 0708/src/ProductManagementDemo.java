public class ProductManagementDemo {

    public static void main(String[] args) {
//        Product pencil = new Product();
//        pencil.name = "monami";
//        pencil.price = 1_000;
//        System.out.printf("name: %s, price: %,d원%n", pencil.name, pencil.price);
//
//        Product computer = new Product();
//        computer.name = "computer";
//        computer.price = 2_000_000;
//        System.out.printf("name: %s, price: %,d원%n", computer.name, computer.price);

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Product[] products = new Product[2]; // Initialization of reference array

        int i = 0;
        while(i < 2) {
            products[i] = new Product(); // Make instance of reference element

            System.out.print("Name of the product: ");
            products[i].name = scanner.next();

            System.out.print("Price of the product: ");
            products[i].price = scanner.nextInt();

            System.out.println();

            i++;
        }

        for (i = 0; i < 2; i++) {
            System.out.printf("Name: %s, Price: %,d%n", products[i].name, products[i].price);
        }

        scanner.close();
    }
}