package com.company.TutorialsPoint.Strategy.Strategy.TemplateMethod;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game initialized! start playing");
    }

    @Override
    void startPlay() {
        System.out.println("Cricked game started. enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game finished");
    }
}
