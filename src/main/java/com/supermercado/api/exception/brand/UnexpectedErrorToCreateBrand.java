package com.supermercado.api.exception.brand;

public class UnexpectedErrorToCreateBrand extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Erro inesperado ao criar narca.";

    public UnexpectedErrorToCreateBrand(){
        super(DEFAULT_MESSAGE);
    };

    public UnexpectedErrorToCreateBrand(String message) {
        super(message);
    }
}
