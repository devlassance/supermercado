package com.supermercado.api.exception.categoryProduct;

public class CategoryNotFoundException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Categoria não encontrada.";
    public CategoryNotFoundException() {
        super(DEFAULT_MESSAGE);
    }
    public CategoryNotFoundException(String message) {
        super(message);
    }
}
