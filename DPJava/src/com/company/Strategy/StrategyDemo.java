package com.company.Strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationA());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationB());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationC());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
