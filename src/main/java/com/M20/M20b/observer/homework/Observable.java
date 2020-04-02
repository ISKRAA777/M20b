package com.M20.M20b.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
