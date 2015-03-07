package com.emc.patterns.observer;

class Subscriber implements Observer {

    @Override
    public void update(Event event) {
        System.out.println("Subscriber: " + hashCode() + " Received the event: " + event.hashCode());
    }

}
