package com.supermercado.api.modules.product.dto.request;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ProductCreateRequest(
        @NotBlank(message = "Informar um nome é obrigatório")
        @Size(max = 255, message = "O nome deve ter no máximo 100 caracteres")
        String name,

        String description,

        @NotBlank(message = "Informar um preço é obrigatório")
        @DecimalMin(value="0.0", inclusive = false, message = "O preço deve ser maior que zero")
        @Digits(integer = 8, fraction = 2, message = "Preço inválido, máximo 8 dígitos inteiros e 2 decimais")
        BigDecimal price,

        @DecimalMin(value="0.0", inclusive = false, message = "O preço deve ser maior que zero")
        @Digits(integer = 8, fraction = 2, message = "Preço inválido, máximo 8 dígitos inteiros e 2 decimais")
        BigDecimal promotionPrice,

        @NotBlank(message = "Quantidade é obrigatório")
        @Min(0)
        @Digits(integer = 8, fraction = 0, message = "Quantidade inválida")
        Integer quantity,

        @NotBlank(message = "Categoria é obrigatório")
        Long categoryId,

        @NotBlank(message = "Marca é obrigatório")
        Long brandId
) {}
