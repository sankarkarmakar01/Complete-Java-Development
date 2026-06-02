package com.crud.service.impl;

import com.crud.dto.request.UserRequest;
import com.crud.dto.response.UserResponse;
import com.crud.entity.User;
import com.crud.exception.ResourceNotFoundException;
import com.crud.mapper.UserMapper;
import com.crud.repository.UserRepository;
import com.crud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse create(UserRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already in use: " + request.getEmail());
        }
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .build();
        return userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public UserResponse getById(Long id) {
        return userMapper.toResponse(findOrThrow(id));
    }

    @Override
    public List<UserResponse> getAll() {
        return userRepository.findAll().stream()
                .map(userMapper::toResponse).toList();
    }

    @Override
    public UserResponse update(Long id, UserRequest request) {
        User user = findOrThrow(id);
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        return userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(findOrThrow(id));
    }

    private User findOrThrow(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
}