package com.supermercado.api.modules.brand.controller;

import com.supermercado.api.modules.brand.dto.request.BrandCreateRequest;
import com.supermercado.api.modules.brand.service.CreateBrandService;
import com.supermercado.api.wrapper.MessageResponse;
import org.apache.coyote.BadRequestException;
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
    public ResponseEntity<MessageResponse> createBrand(@RequestBody @Validated BrandCreateRequest request) {
        try {
            createBrandService.handle(request);
            return ResponseEntity.ok(new MessageResponse("Marca criada com sucesso!"));
        } catch (BadRequestException e) {
            return ResponseEntity.badRequest().body(new MessageResponse(e.getMessage()));
        } catch (RuntimeException e) {
            return ResponseEntity.internalServerError().body(new MessageResponse(e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new MessageResponse("Erro inesperado ao criar a marca"));
        }
    }
}
