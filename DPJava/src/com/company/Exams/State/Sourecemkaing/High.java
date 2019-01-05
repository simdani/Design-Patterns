package com.company.Exams.State.Sourecemkaing;

public class High implements State {
    @Override
    public void pull(CeilingFanPullChain wrapper) {
        wrapper.setState(new Off());
        System.out.println("turning off");
    }
}
