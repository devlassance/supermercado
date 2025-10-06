package com.supermercado.api.exception.brand;

public class BrandNotFoundException extends RuntimeException {
    private static  final String DEFAULT_MESSAGE = "Marca não encontrada.";

    public BrandNotFoundException() {
        super(DEFAULT_MESSAGE);
    }

    public BrandNotFoundException(String message) {
        super(message);
    }
}
