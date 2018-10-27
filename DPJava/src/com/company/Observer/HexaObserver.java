package com.company.Observer;

public class HexaObserver implements Observer {
    private Subject subject;

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hex string: " + Integer.toHexString(subject.getState()));
    }
}
