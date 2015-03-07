package com.emc.patterns.strategy;

class Animal {

    private Behavior strategy;

    public Animal() {
        super();
    }

    public void setBehavior(Behavior strategy) {
        this.strategy = strategy;
    }

    public void doBehavior() {
        strategy.doOperation();
    }

}
