package com.company.Exams.State.Sourecemkaing;

public class Off implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setState(new Low());
        System.out.println("low speed");
    }
}
