package com.emc.patterns.strategy;

public class CatBehavior implements Behavior {

    @Override
    public void doOperation() {
        System.out.println("Meow...");
    }

}
