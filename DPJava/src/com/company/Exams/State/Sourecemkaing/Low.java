package com.company.Exams.State.Sourecemkaing;

public class Low implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("medium speed");
    }
}
