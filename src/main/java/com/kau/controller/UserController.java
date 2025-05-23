package com.kau.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kau.model.User;
import com.kau.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repository;

    public UserController() {}

    @PostMapping("/login")
    void login (@RequestBody String id, String pw) {
        User user = repository.findById();


    }
}