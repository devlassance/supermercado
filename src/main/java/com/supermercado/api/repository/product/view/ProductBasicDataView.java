package com.supermercado.api.repository.product.view;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "name", "description", "brand", "category", "price", "promotionPrice", "quantity"})
public interface ProductBasicDataView {
    Long getId();
    String getName();
    String getDescription();
    BrandInfo getBrand();
    CategoryInfo getCategory();
    String getPrice();
    String getPromotionPrice();
    Integer getQuantity();

    @JsonPropertyOrder({"id", "name"})
    interface CategoryInfo {
        Long getId();
        String getName();
    }

    @JsonPropertyOrder({"id", "name"})
    interface BrandInfo {
        Long getId();
        String getName();
    }
}
