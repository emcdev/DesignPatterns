package com.emc.patterns.strategy;

public class Animal {

    SoundStrategy strategy;

    public Animal() {
        super();
    }

    public void setStrategy(SoundStrategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(int argA, int argB) {
        strategy.doOperation();
    }

}
