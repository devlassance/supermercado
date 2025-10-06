package com.supermercado.api.exception.product;

public class InvalidDataToCreateProduct extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Dados inválidos para criar o produto.";
    public InvalidDataToCreateProduct() {
        super(DEFAULT_MESSAGE);
    }

    public InvalidDataToCreateProduct(String message) {
        super(message);
    }
}
