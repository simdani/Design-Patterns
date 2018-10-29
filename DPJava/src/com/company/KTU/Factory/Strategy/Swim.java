package com.company.KTU.Factory.Strategy;

public class Swim implements IMoveAlgorithm {
    @Override
    public void move() {
        System.out.println("I am swimming");
    }
}
