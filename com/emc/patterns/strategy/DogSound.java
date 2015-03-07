package com.emc.patterns.strategy;

public class DogSound implements SoundStrategy {

    @Override
    public void doOperation() {
        System.out.println("Ruff!");
    }

}
