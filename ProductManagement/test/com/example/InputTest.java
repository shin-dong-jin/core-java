package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputTest {
    private List<Product> products = new ArrayList<>();

    @BeforeEach
    void init() {
        this.products = new ArrayList<>();
    }

    @Test
    void fileInput() {
        Input input = new Input(products);
        input.fileInput();
        assertThat(products).isNotNull();
        assertThat(products.get(5).getName()).isEqualTo("DISKETTE");
    }
}