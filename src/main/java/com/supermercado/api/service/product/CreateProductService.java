package com.supermercado.api.service.product;

import com.supermercado.api.exception.product.InvalidDataToCreateProduct;
import com.supermercado.api.exception.product.UnexpectedErrorToCreateProduct;
import com.supermercado.api.model.Brand;
import com.supermercado.api.repository.brand.BrandRepository;
import com.supermercado.api.model.CategoryProduct;
import com.supermercado.api.repository.categoryProduct.CategoryProductRepository;
import com.supermercado.api.dto.request.product.CreateProductRequest;
import com.supermercado.api.exception.brand.BrandNotFoundException;
import com.supermercado.api.exception.categoryProduct.CategoryNotFoundException;
import com.supermercado.api.model.Product;
import com.supermercado.api.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CreateProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryProductRepository categoryProductRepository;

    @Autowired
    private BrandRepository brandRepository;

    public void handle(CreateProductRequest request) {

        CategoryProduct categoryProduct = categoryProductRepository.findById(request.categoryId())
                .orElseThrow(CategoryNotFoundException::new);

        Brand brand = brandRepository.findById(request.brandId())
                .orElseThrow(BrandNotFoundException::new);

        try {
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
            throw new InvalidDataToCreateProduct();
        } catch (Exception e) {
            throw new UnexpectedErrorToCreateProduct();
        }
    }
}
