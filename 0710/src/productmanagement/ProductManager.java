package productmanagement;

public class ProductManager {

    public static void main(String[] args) throws java.io.IOException {
        String file = "./src/productmanagement/productdata.txt";
        Reader reader = new Reader(file);
        Writer writer = new Writer();
        Product[] products = new Product[7];

        for (int i = 0; i < 7; i++) {
            String[] line = java.util.Arrays.stream(reader.readLine().split("\\s+")).map(String::trim).toArray(String[]::new);
            products[i] = new Product(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]));
        }

        writer.view(products);

        reader.close();
    }
}
