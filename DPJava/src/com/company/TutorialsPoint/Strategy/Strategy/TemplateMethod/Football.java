package com.company.TutorialsPoint.Strategy.Strategy.TemplateMethod;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football game initialized! Start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Football game has started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game finished");
    }
}
