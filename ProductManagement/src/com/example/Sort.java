package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    private List<Product> products;

    public Sort(List<Product> products) {
        this.products = products;
    }

    public void quickSort() {
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o2.getBenefit() - o1.getBenefit();
//            }
//        });

        Collections.sort(products);
    }
}
