package com.crud.service.impl;

import com.crud.dto.request.ProductRequest;
import com.crud.dto.response.ProductResponse;
import com.crud.entity.Product;
import com.crud.entity.User;
import com.crud.exception.ResourceNotFoundException;
import com.crud.mapper.ProductMapper;
import com.crud.repository.ProductRepository;
import com.crud.repository.UserRepository;
import com.crud.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ProductMapper productMapper;

    @Override
    public ProductResponse create(Long userId, ProductRequest request) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found: " + userId));

        Product product = Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .user(user)
                .build();

        return productMapper.toResponse(productRepository.save(product));
    }

    @Override
    public ProductResponse getById(Long id) {
        return productMapper.toResponse(findOrThrow(id));
    }

    @Override
    public List<ProductResponse> getByUser(Long userId) {
        return productRepository.findByUserId(userId)
                .stream().map(productMapper::toResponse).toList();
    }

    @Override
    public ProductResponse update(Long id, ProductRequest request) {
        Product product = findOrThrow(id);
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        return productMapper.toResponse(productRepository.save(product));
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(findOrThrow(id));
    }

    private Product findOrThrow(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }
}