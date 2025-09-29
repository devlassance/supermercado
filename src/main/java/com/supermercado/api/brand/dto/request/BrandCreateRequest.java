package com.supermercado.api.brand.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record BrandCreateRequest(

    @NotBlank(message = "Informar um nome é obrigatório")
    @Size(max = 255, message = "O nome deve ter no máximo 100 caracteres")
    String name,

    @NotBlank(message = "Informar um slug é obrigatório")
    String slug,

    String description
) {}
