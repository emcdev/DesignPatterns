package com.emc.patterns.strategy;

class DogBehavior implements Behavior {

    @Override
    public void showBehavior() {
        System.out.println("Ruff!");
    }

}
