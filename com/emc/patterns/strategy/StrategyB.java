package com.emc.patterns.strategy;

public class StrategyB implements Strategy {

    @Override
    public void doOperation(int argA, int argB) {
        System.out.println("strategy B");
    }

}
