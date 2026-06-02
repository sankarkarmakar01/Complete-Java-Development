package com.crud.service;

import com.crud.dto.request.ProductRequest;
import com.crud.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse create(Long userId, ProductRequest request);
    ProductResponse getById(Long id);
    List<ProductResponse> getByUser(Long userId);
    ProductResponse update(Long id, ProductRequest request);
    void delete(Long id);
}