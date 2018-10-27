package com.company.Observer;

public interface Subject {
    public void add(Observer observer);
    public void notifyObservers();
    public int getState();
    public void setState(int state);
}
