package com.emc.patterns.strategy;

public class DogBehavior implements Behavior {

    @Override
    public void doOperation() {
        System.out.println("Ruff!");
    }

}
