package com.emc.patterns.strategy;

class Animal {

    private SoundStrategy strategy;

    public Animal() {
        super();
    }

    public void setStrategy(SoundStrategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy() {
        strategy.doOperation();
    }

}
