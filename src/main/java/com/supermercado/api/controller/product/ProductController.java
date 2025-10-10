package com.supermercado.api.controller.product;


import com.supermercado.api.dto.request.product.CreateProductRequest;
import com.supermercado.api.repository.product.ProductRepository;
import com.supermercado.api.repository.product.view.ProductBasicDataView;
import com.supermercado.api.service.product.CreateProductService;
import com.supermercado.api.wrapper.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private CreateProductService createProductService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductBasicDataView>> getProducts(){
        return ResponseEntity.ok(productRepository.findByIsActiveTrueOrderByNameAsc());
    }

    @PostMapping("/create")
    public ResponseEntity<MessageResponse> createProduct(@RequestBody @Validated CreateProductRequest request) {
        createProductService.handle(request);
        return ResponseEntity.ok(new MessageResponse("Produto criada com sucesso."));
    }
}
