package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Input {
    private List<Product> products;
    private Scanner scanner;
    private File file;

    public Input(List<Product> products) {
        try {
            this.products = products;
            this.file = new File("productdata.txt");
            scanner = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            System.exit(0);
        }
    }

    public void fileInput() {
        while (scanner.hasNextLine()) {
            /* Parsing
            1. string.split(regex)
            2. scanner.useDelimiter(regex)
            3. StringTokenizer(message, delim)
             */
            String line = scanner.nextLine();
            Scanner scanner = new Scanner(line).useDelimiter("\\s+");
            Product product = new Product(
                    scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()
            );
            products.add(product);
        }
    }
}
