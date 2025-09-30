package com.supermercado.api.modules.brand.service;

import com.supermercado.api.modules.brand.dto.request.BrandCreateRequest;
import com.supermercado.api.modules.brand.model.Brand;
import com.supermercado.api.modules.brand.repository.BrandRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CreateBrandService {

    @Autowired
    private BrandRepository brandRepository;

    public void handle(BrandCreateRequest request) throws DataIntegrityViolationException, BadRequestException {
        try {
            Brand brand = new Brand();
            brand.setName(request.name());
            brand.setSlug(request.slug());
            brand.setDescription(request.description());
            brand.setLogoUrl(request.logoUrl());
            brandRepository.save(brand);
        } catch (DataIntegrityViolationException e) {
            throw new BadRequestException("Dados inválidos para criar a marca", e);
        } catch (Exception e) {
            throw new RuntimeException("Erro inesperado ao criar a marca", e);
        }
    }
}