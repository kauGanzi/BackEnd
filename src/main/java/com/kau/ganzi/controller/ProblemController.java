package com.kau.ganzi.controller;

import com.kau.ganzi.model.Problem;
import com.kau.ganzi.repository.ProblemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProblemController {
    private final ProblemRepository problemRepository;

    @GetMapping("/problem")
    public ResponseEntity<Problem> getProblem() {
        Problem problem = problemRepository.getRandomProblem();

        return ResponseEntity.status(200).body(problem);
    }
}
