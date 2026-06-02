package com.crud.mapper;

import com.crud.dto.response.UserResponse;
import com.crud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final ProductMapper productMapper;

    public UserMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .products(user.getProducts().stream()
                        .map(productMapper::toResponse)
                        .toList())
                .build();
    }


}
