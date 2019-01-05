package com.company.Exams.Flyweight.Sourcemaking;

public class FlyweightDemo {
    public static final int RowS = 6, COLS = 10;

    public static void main(String[] args) {
        Factory theFactory = new Factory(RowS);

        for (int i = 0; i < RowS; i++) {
            for (int j = 0; j < COLS; j++) {
                theFactory.getFlyweight(i).report(j);
            }
            System.out.println();
        }
    }
}
