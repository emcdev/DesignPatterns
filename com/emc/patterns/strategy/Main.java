package com.emc.patterns.strategy;

public class Main {

    public static void main(String[] args) {

        Strategy strategyA = new StrategyA();

        Context context = new Context(strategyA);

        context.doStrategy(argA, argB);

    }

}
