package com.emc.patterns.strategy;

class Animal {

    private Behavior strategy;

    Animal() {
        super();
    }

    void setBehavior(Behavior strategy) {
        this.strategy = strategy;
    }

    void showBehavior() {
        strategy.showBehavior();
    }

}
