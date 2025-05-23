package com.kau.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.kau.model.Problem;

@Component
public class ProblemRepository {
    private final List<Problem> problemList = new ArrayList<>();
    private final Random random = new Random();

    public Optional<Problem> getRandomProblem() {
        int index = random.nextInt(problemList.size());
        return Optional.of(problemList.get(index));
    }

    public ProblemRepository() {
        // 문제 채우기
    }
}