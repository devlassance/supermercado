package com.supermercado.api.exception.product;

public class UnexpectedErrorToCreateProduct extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Erro inesperado ao criar o produto.";
    public UnexpectedErrorToCreateProduct() {
        super(DEFAULT_MESSAGE);
    }

    public UnexpectedErrorToCreateProduct(String message) {
        super(message);
    }
}
