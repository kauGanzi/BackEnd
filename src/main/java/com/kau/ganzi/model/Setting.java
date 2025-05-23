package com.kau.ganzi.model;

public class Setting {
    private String speaker = "robot";
    private double speed = 1.0;

    public Setting() { }
    public Setting(String speaker, double speed) {
        this.speaker = speaker;
        this.speed = speed;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}