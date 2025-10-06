package com.supermercado.api.exception.brand;

public class InvalidDataToCreateBrand extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Dados inválidos ao criar marca.";

    public InvalidDataToCreateBrand(){
        super(DEFAULT_MESSAGE);
    };
    public InvalidDataToCreateBrand(String message) {
        super(message);
    }
}
