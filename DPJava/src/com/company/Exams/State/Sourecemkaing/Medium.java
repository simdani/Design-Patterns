package com.company.Exams.State.Sourecemkaing;

public class Medium implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setState(new High());
        System.out.println("high speed");
    }
}
