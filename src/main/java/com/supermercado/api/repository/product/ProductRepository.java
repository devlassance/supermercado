package com.supermercado.api.repository.product;

import com.supermercado.api.model.Product;
import com.supermercado.api.repository.product.view.ProductBasicDataView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<ProductBasicDataView> findByIsActiveTrueOrderByNameAsc();
}
