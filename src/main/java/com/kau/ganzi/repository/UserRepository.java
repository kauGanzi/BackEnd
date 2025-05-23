package com.kau.ganzi.repository;

import com.kau.ganzi.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
public class UserRepository {
    private final List<User> userList = new ArrayList<>();

    public Optional<User> findById(String id) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    public UserRepository() {
        User user = new User("admin", "admin");
        userList.add(user);
    }
}