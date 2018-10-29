package com.company.TutorialsPoint.Strategy.Strategy.Command;

public class BuyStock implements Order {
    private Stock absStock;

    public BuyStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}
