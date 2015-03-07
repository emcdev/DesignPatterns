package com.emc.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    private Event latestEvent;

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Add observer");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Remove observer");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notify observers");
        for (Observer observer : observers) {
            // this is a push approach
            observer.update(latestEvent);
        }
    }

    void setEvent(Event event) {
        System.out.println("New event");
        latestEvent = event;
        notifyObservers();
    }

}
