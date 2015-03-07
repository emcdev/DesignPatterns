package com.emc.patterns.observer;

class Main {

    public static void main(String[] args) {

        Subscriber subscriberA = new Subscriber();
        Subscriber subscriberB = new Subscriber();

        Publisher publisher = new Publisher();
        publisher.registerObserver(subscriberA);
        publisher.registerObserver(subscriberB);

        publisher.setEvent(new Event());

        publisher.removeObserver(subscriberA);

        publisher.setEvent(new Event());

    }

}
