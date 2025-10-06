package com.supermercado.api.controller.brand;

import com.supermercado.api.dto.request.brand.CreateBrandRequest;
import com.supermercado.api.service.brand.CreateBrandService;
import com.supermercado.api.wrapper.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private CreateBrandService createBrandService;

    @PostMapping("/create")
    public ResponseEntity<MessageResponse> createBrand(@RequestBody @Validated CreateBrandRequest request) {

        createBrandService.handle(request);
        return ResponseEntity.ok(new MessageResponse("Marca criada com sucesso!"));

    }
}
