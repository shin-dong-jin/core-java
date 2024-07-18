package com.example;

import java.util.List;

public class Calc {
    private List<Product> products;

    public Calc(List<Product> products) {
        this.products = products;
    }

    public void calc() {
        /*
            판매금액 = 수량 * 판매단가
            매입금액 = 수량 * 매입단가
            이익금 = 판매금액 - (매입금액 + 운송료)
            이익율 = 이익금 / 매입금액  100
         */

        for(Product product : products) {
            int sellMoney = product.getQuantity() * product.getSellPrice();
            int buyMoney = product.getQuantity() * product.getBuyPrice();
            int benefit = sellMoney - (buyMoney + product.getTransport());
            double rate = 100. * benefit / buyMoney;

            product.setBenefit(benefit);
            product.setRate(rate);
        }
    }
}
