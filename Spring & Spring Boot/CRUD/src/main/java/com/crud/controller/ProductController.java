package com.crud.controller;

import com.crud.dto.request.ProductRequest;
import com.crud.dto.response.ProductResponse;
import com.crud.service.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Tag(name = "Products")
public class ProductController {

    private final ProductService productService;

    // POST /api/v1/users/{userId}/products
    @PostMapping("/users/{userId}/products")
    public ResponseEntity<ProductResponse> create(@PathVariable Long userId,
                                                  @Valid @RequestBody ProductRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productService.create(userId, request));
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getById(id));
    }

    // GET /api/v1/users/{userId}/products
    @GetMapping("/users/{userId}/products")
    public ResponseEntity<List<ProductResponse>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(productService.getByUser(userId));
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id,
                                                  @Valid @RequestBody ProductRequest request) {
        return ResponseEntity.ok(productService.update(id, request));
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }
}