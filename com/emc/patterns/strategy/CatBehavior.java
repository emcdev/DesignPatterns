package com.emc.patterns.strategy;

class CatBehavior implements Behavior {

    @Override
    public void showBehavior() {
        System.out.println("Meow...");
    }

}
