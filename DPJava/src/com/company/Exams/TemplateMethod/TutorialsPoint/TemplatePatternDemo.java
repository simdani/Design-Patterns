package com.company.Exams.TemplateMethod.TutorialsPoint;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
        game = new Basketball();
        game.play();
    }
}
