package com.emc.patterns.strategy;

public class StrategyA implements Strategy {

    @Override
    public void doOperation(int argA, int argB) {
        System.out.println("strategy A");
    }

}
