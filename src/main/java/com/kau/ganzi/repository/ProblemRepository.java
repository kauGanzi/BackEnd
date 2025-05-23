package com.kau.ganzi.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.kau.ganzi.model.Problem;

@Component
public class ProblemRepository {
    private final List<Problem> problemList = new ArrayList<>();
    private final Random random = new Random();

    public Problem getRandomProblem() {
        int index = random.nextInt(problemList.size());
        return problemList.get(index);
    }

    public ProblemRepository() {
        // 문제 채우기
        
        String[] choices = new String[4];
        
        
        choices[0] = "규칙적인 운동";
        choices[1] = "충분한 수면";
        choices[2] = "머리를 다치지 않게 보호";
        choices[3] = "모두 해당됨";
        
        Problem problem1 = new Problem(
                1,
                "다음 중 치매 예방에 도움이 되는 행동은?",
                choices,
                3
        );

        choices[0] = "바닥에 물기 제거";
        choices[1] = "미끄러운 슬리퍼 신기";
        choices[2] = "방 안에 물건 늘어놓기";
        choices[3] = "밤에도 불 끄기";
        
        Problem problem2 = new Problem(
                2,
                "넘어지지 않기 위해 집안에서 조심해야 할 것은?",
                choices,
                0
        );

        choices[0] = "골고루 먹기";
        choices[1] = "짜게 먹기";
        choices[2] = "끼니 거르기";
        choices[3] = "기름진 음식만 먹기";
        
        Problem problem3 = new Problem(
                3,
                "건강을 지키기 위해 필요한 식습관은?",
                choices,
                0
        );

        choices[0] = "스트레스를 줄이기";
        choices[1] = "짜게 먹기";
        choices[2] = "운동을 피하기";
        choices[3] = "잠을 줄이기";
        
        Problem problem4 = new Problem(
                4,
                "고혈압 예방에 좋은 생활 습관은?",
                choices,
                0
        );

        choices[0] = "외로움을 줄일 수 있다";
        choices[1] = "마음이 편안해진다";
        choices[2] = "치매 예방에 도움이 된다";
        choices[3] = "모두 해당됨";
        
        Problem problem5 = new Problem(
                5,
                "일상 속에서 친구, 가족과의 대화가 중요한 이유는?",
                choices,
                3
        );

        problemList.add(problem1);
        problemList.add(problem2);
        problemList.add(problem3);
        problemList.add(problem4);
        problemList.add(problem5);
    }
}