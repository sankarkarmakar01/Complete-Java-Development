package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getSingleUser(@PathVariable UUID id) {
        if (id != null) {
            return userService.getUserById(id);
        }
        return Optional.empty();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        if(user != null) {
            return userService.createUser(user);
        }
        return null;
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable UUID id, @RequestBody User user) {
        if (id != null) {
            return userService.updateUser(id,user);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userService.deleteUser(id);
        System.out.println("User Deleted.");
    }


}
