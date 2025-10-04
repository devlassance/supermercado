package com.supermercado.api.modules.product.service;

import com.supermercado.api.modules.brand.model.Brand;
import com.supermercado.api.modules.brand.repository.BrandRepository;
import com.supermercado.api.modules.categoryProduct.model.CategoryProduct;
import com.supermercado.api.modules.categoryProduct.repository.CategoryProductRepository;
import com.supermercado.api.modules.product.dto.request.ProductCreateRequest;
import com.supermercado.api.modules.product.exception.BrandNotFoundException;
import com.supermercado.api.modules.product.exception.CategoryNotFoundException;
import com.supermercado.api.modules.product.model.Product;
import com.supermercado.api.modules.product.repository.ProductRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryProductRepository categoryProductRepository;

    @Autowired
    private BrandRepository brandRepository;

    public void handle(ProductCreateRequest request) throws  {

        try {
            CategoryProduct categoryProduct = categoryProductRepository.findById(request.categoryId())
                    .orElseThrow(() -> new CategoryNotFoundException("Categoria não encontrada."));

            Brand brand = brandRepository.findById(request.brandId())
                    .orElseThrow(() -> new BrandNotFoundException("Marca não encontrada."));

            Product product = new Product();
            product.setName(request.name());
            product.setDescription(request.description());
            product.setPrice(request.price());
            product.setPromotionPrice(request.promotionPrice());
            product.setQuantity(request.quantity());
            product.setCategory(categoryProduct);
            product.setBrand(brand);
            productRepository.save(product);
        } catch (DataIntegrityViolationException e) {
            throw new BadRequestException("Dados inválidos para criar o produto.", e)
        } catch (Exception e) {
            throw new RuntimeException("Erro inesperado ao criar a marca", e);
        }


    }
}
