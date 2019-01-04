package com.company.Exams.TemplateMethod.Sourcemaking;

public abstract class Generalization {
    public final void findSolution() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }

    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }

    abstract void stepTwo();
    abstract void stepThree();

    void stepFour() {
        System.out.println("Generalization.stepFour");
    }
}
