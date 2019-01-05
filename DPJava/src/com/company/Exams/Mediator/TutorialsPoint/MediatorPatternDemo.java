package com.company.Exams.Mediator.TutorialsPoint;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("hi! John!");
        john.sendMessage("hello! Robert!");
    }
}
