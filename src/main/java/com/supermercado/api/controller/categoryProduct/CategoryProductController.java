package com.supermercado.api.controller.categoryProduct;

import com.supermercado.api.repository.categoryProduct.CategoryProductRepository;
import com.supermercado.api.repository.categoryProduct.view.CategoryProductBasicDataView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/category-products")
public class CategoryProductController {

    @Autowired
    private CategoryProductRepository categoryProductRepository;


    @GetMapping
    public ResponseEntity<List<CategoryProductBasicDataView>> getCategories(){
        return ResponseEntity.ok(categoryProductRepository.findByParentIdNullOrderBySortOrderAsc());
    }
}
