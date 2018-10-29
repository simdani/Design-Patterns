package com.company.TutorialsPoint.Strategy.Strategy.Strategy;

public class OperationA implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
