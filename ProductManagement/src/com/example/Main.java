package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Input input = new Input(products);
        input.fileInput();

        Calc calc = new Calc(products);
        calc.calc();

        Sort sort = new Sort(products);
        sort.quickSort();

        Output output = new Output(products);
        output.print();

        System.out.println("Program is over...");
    }
}
