package com.emc.patterns.strategy;

class Animal {

    private Behavior behavior;

    Animal() {
        super();
    }

    // enable behavior to change dynamically during runtime
    void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    void showBehavior() {
        behavior.showBehavior();
    }

}
