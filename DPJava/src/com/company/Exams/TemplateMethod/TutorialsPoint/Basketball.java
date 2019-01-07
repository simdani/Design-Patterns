package com.company.Exams.TemplateMethod.TutorialsPoint;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("Basketball game has been initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Basketball game has been started");
    }

    @Override
    void endPlay() {
        System.out.println("Basketball game has ended.");
    }
}
