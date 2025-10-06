package com.supermercado.api.handler;

import com.supermercado.api.exception.brand.BrandNotFoundException;
import com.supermercado.api.exception.categoryProduct.CategoryNotFoundException;
import com.supermercado.api.exception.product.InvalidDataToCreateProduct;
import com.supermercado.api.exception.product.UnexpectedErrorToCreateProduct;
import com.supermercado.api.wrapper.MessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MessageResponse> handleValidationException(MethodArgumentNotValidException ex) {
        String message = ex.getBindingResult()
                .getAllErrors()
                .getFirst()
                .getDefaultMessage();

        return ResponseEntity.badRequest().body(new MessageResponse(message));
    }

    @ExceptionHandler(BrandNotFoundException.class)
    public ResponseEntity<MessageResponse> handleBrandNotFoundException(BrandNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse(ex.getMessage()));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<MessageResponse> handleCategoryNotFoundException(CategoryNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new MessageResponse(ex.getMessage()));
    }

    @ExceptionHandler(InvalidDataToCreateProduct.class)
    public ResponseEntity<MessageResponse> handleInvalidDataToCreateProduct(InvalidDataToCreateProduct ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MessageResponse(ex.getMessage()));
    }

    @ExceptionHandler(UnexpectedErrorToCreateProduct.class)
    public ResponseEntity<MessageResponse> handleUnexpectedErrorToCreateProduct(UnexpectedErrorToCreateProduct ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new MessageResponse(ex.getMessage()));
    }
}
