package com.kau.ganzi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String id;
    private String pw;
    private String name = "김노인";

    public User() {}

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }
}
