package com.supermercado.api.modules.brand.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record BrandCreateRequest(

    @NotBlank(message = "Informar um nome é obrigatório")
    @Size(max = 255, message = "O nome deve ter no máximo 255 caracteres")
    String name,

    @NotBlank(message = "Informar um slug é obrigatório")
    @Size(max = 255, message = "O slug deve ter no máximo 255 caracteres")
    @Pattern(
        regexp = "^[a-z0-9]+(?:-[a-z0-9]+)*$",
        message = "O slug deve estar em kebab-case, ex: 'meu-slug-teste'"
    )
    String slug,

    String description,

    @Size(max = 512, message = "A URL do logo deve ter no máximo 512 caracteres")
    String logoUrl
) {}
