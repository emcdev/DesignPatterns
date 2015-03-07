package com.emc.patterns.strategy;

public class CatSound implements SoundStrategy {

    @Override
    public void doOperation() {
        System.out.println("Meow...");
    }

}
