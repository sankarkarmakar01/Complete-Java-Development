package com.crud.service;

import com.crud.dto.request.UserRequest;
import com.crud.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse create(UserRequest request);
    UserResponse getById(Long id);
    List<UserResponse> getAll();
    UserResponse update(Long id, UserRequest request);
    void delete(Long id);
}