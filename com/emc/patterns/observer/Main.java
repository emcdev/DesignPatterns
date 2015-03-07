package com.emc.patterns.observer;

class Main {

    public static void main(String[] args) {

        Observer subscriberA = new Subscriber();
        Observer subscriberB = new Subscriber();

        Publisher publisher = new Publisher();
        publisher.registerObserver(subscriberA);
        publisher.registerObserver(subscriberB);

        publisher.setEvent(new Event());
    }

}
