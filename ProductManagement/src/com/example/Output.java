package com.example;

import java.util.List;

public class Output {
    private List<Product> products;

    public Output(List<Product> products) {
        this.products = products;
    }

    public void print() {
        labelPrint();

        for(Product product : products) {
            System.out.println(product); // p.toString()
        }
    }

    private void labelPrint() {
        System.out.println("          <<제품관리프로그램>>");
        System.out.println("----------------------------------------------");
        System.out.println("제품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율");
        System.out.println("----------------------------------------------");
    }
}
