package com.kau.ganzi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kau.ganzi.model.User;
import com.kau.ganzi.repository.UserRepository;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepository repository;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        Optional<User> userOpt = repository.findById(user.getId());

        if (userOpt.isPresent()) {
            User foundUser = userOpt.get();

            if (foundUser.getPw().equals(user.getPw())) {
                return ResponseEntity.ok(foundUser);
            }

            else {
                return ResponseEntity.status(401).body("비밀번호가 일치하지 않습니다");
            }
        }

        return ResponseEntity.status(404).body("해당 ID의 유저가 존재하지 않습니다");
    }
}