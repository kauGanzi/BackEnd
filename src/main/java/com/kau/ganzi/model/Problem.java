package com.kau.ganzi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Problem {
    private long id;
    private String question;
    private String[] choices = new String[4];
    private int correctAnswer;

    public Problem() {}
}