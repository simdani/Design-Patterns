package com.company.Exams.State.Sourecemkaing;

public class CeilingFanPullChain {
    private State currentState;

    public CeilingFanPullChain() {
        currentState = new Off();
    }

    public void setState(State s) {
        currentState = s;
    }

    public void pull() {
        currentState.pull(this);
    }
}
