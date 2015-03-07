package com.emc.patterns.strategy;

class Main {

    public static void main(String[] args) {

        Animal context = new Animal();

        SoundStrategy strategyA = new DogSound();
        context.setStrategy(strategyA);
        context.doStrategy();

        SoundStrategy strategyB = new CatSound();
        context.setStrategy(strategyB);
        context.doStrategy();

    }

}
