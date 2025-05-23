package com.kau.model;

public class Problem {
    private long id;
    private String question;
    private String[] choices = new String[4];
    private int correctAnswer;

    public Problem() {}
    public Problem(long id, String question, String[] choices, int correctAnswer) {
        this.id = id;
        this.question = question;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    // choices 넣기
    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    } 

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}