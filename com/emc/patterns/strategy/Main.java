package com.emc.patterns.strategy;

public class Main {

    public static void main(String[] args) {

        Strategy strategyA = new StrategyA();

        Context context = new Context(strategyA);

        int argA = 0;
        int argB = 0;

        context.doStrategy(argA, argB);

    }

}
