package com.company.CombinedPatterns;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
