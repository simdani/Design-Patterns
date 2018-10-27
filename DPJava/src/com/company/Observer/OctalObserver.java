package com.company.Observer;

public class OctalObserver implements Observer {
    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string: " + Integer.toOctalString(subject.getState()));
    }
}
