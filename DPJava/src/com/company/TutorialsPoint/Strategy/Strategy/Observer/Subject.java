package com.company.TutorialsPoint.Strategy.Strategy.Observer;

public interface Subject {
    public void add(Observer observer);
    public void notifyObservers();
    public int getState();
    public void setState(int state);
}
