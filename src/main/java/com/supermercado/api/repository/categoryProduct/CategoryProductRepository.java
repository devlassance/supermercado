package com.supermercado.api.repository.categoryProduct;

import com.supermercado.api.model.CategoryProduct;
import com.supermercado.api.repository.categoryProduct.view.CategoryProductBasicDataView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryProductRepository extends JpaRepository<CategoryProduct, Long> {
    List<CategoryProductBasicDataView> findByParentIdNullOrderBySortOrderAsc();
}
