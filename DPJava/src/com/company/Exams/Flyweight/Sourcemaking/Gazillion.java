package com.company.Exams.Flyweight.Sourcemaking;

public class Gazillion {
    private int row;

    public Gazillion(int row) {
        row = row;
    }

    void report(int col) {
        System.out.println(" " + row + col);
    }
}
