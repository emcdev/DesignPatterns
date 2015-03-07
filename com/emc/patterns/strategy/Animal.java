package com.emc.patterns.strategy;

class Animal {

    private Behavior behavior;

    Animal() {
        super();
    }

    void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    void showBehavior() {
        behavior.showBehavior();
    }

}
