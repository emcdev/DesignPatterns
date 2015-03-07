package com.emc.patterns.strategy;

public class Main {

    public static void main(String[] args) {

        Animal context = new Animal();

        int argA = 0;
        int argB = 0;

        SoundStrategy strategyA = new DogSound();
        context.setStrategy(strategyA);
        context.doStrategy(argA, argB);

        SoundStrategy strategyB = new CatSound();
        context.setStrategy(strategyB);
        context.doStrategy(argA, argB);

    }

}
