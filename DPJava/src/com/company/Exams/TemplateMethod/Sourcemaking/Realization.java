package com.company.Exams.TemplateMethod.Sourcemaking;

public class Realization extends Specialization {
    @Override
    protected void step3_2() {
        System.out.println("Realization.step3_2");
    }

    @Override
    void stepTwo() {
        System.out.println("Realization.stepTwo");
    }

    @Override
    void stepThree() {
        System.out.println("Realization.stepThree");
    }
}
