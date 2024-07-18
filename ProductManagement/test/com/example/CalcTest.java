package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    List<Product> products;

    @BeforeEach
    void init() {
        products = new ArrayList<>();
    }


    @Test
    void calc() {
        Input input = new Input(products);
        input.fileInput();

        Calc calc = new Calc(products);
        calc.calc();

        assertThat(products.get(1).getBenefit()).isEqualTo(7_597_000);
    }
}