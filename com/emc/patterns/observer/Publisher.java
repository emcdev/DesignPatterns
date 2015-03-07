package com.emc.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private Event latestEvent;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // this is a push approach
            observer.update(latestEvent);
        }
    }

    void setEvent(Event event) {
        latestEvent = event;
        notifyObservers();
    }

}
