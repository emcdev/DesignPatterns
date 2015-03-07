package com.emc.patterns.strategy;

class Animal {

    private Behavior behavior;

    public Animal() {
        super();
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void showBehavior() {
        behavior.showBehavior();
    }

}
