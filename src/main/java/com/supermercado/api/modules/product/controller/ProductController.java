package com.supermercado.api.modules.product.controller;


import com.supermercado.api.modules.product.model.Product;
import com.supermercado.api.wrapper.MessageResponse;
import org.aspectj.bridge.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping("/create")
    public ResponseEntity<MessageResponse> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(new MessageResponse("Marca criada com sucesso!"));
    }
}
