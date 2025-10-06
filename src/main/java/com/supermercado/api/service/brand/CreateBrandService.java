package com.supermercado.api.service.brand;

import com.supermercado.api.dto.request.brand.CreateBrandRequest;
import com.supermercado.api.exception.brand.InvalidDataToCreateBrand;
import com.supermercado.api.exception.brand.UnexpectedErrorToCreateBrand;
import com.supermercado.api.model.Brand;
import com.supermercado.api.repository.brand.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CreateBrandService {

    @Autowired
    private BrandRepository brandRepository;

    public void handle(CreateBrandRequest request) {
        try {
            Brand brand = new Brand();
            brand.setName(request.name());
            brand.setSlug(request.slug());
            brand.setDescription(request.description());
            brand.setLogoUrl(request.logoUrl());
            brandRepository.save(brand);
        } catch (DataIntegrityViolationException e) {
            throw new InvalidDataToCreateBrand();
        } catch (Exception e) {
            throw new UnexpectedErrorToCreateBrand();
        }
    }
}