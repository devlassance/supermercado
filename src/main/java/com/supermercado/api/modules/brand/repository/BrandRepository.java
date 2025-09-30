package com.supermercado.api.modules.brand.repository;

import com.supermercado.api.modules.brand.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
