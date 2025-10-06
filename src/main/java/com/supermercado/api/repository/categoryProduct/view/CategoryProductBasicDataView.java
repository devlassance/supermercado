package com.supermercado.api.repository.categoryProduct.view;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({"id", "name", "slug", "sortOrder", "isActive", "children"})
public interface CategoryProductBasicDataView {
    Long getId();
    String getName();
    String getSlug();
    Integer getSortOrder();
    Boolean getIsActive();
    List<CategoryProductBasicDataView> getChildren();
}
