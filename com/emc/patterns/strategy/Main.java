package com.emc.patterns.strategy;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();

        int argA = 0;
        int argB = 0;

        Strategy strategyA = new StrategyA();
        context.setStrategy(strategyA);
        context.doStrategy(argA, argB);

        Strategy strategyB = new StrategyB();
        context.setStrategy(strategyB);
        context.doStrategy(argA, argB);

    }

}
