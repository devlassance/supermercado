package com.supermercado.api.categoryProduct.repository;

import com.supermercado.api.categoryProduct.model.CategoryProduct;
import com.supermercado.api.categoryProduct.repository.views.CategoryProductBasicDataView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryProductRepository extends JpaRepository<CategoryProduct, Long> {
    List<CategoryProductBasicDataView> findByParentIdNullOrderBySortOrderAsc();
}
