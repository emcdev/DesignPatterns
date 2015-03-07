package com.emc.patterns.strategy;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(int argA, int argB) {
        strategy.doOperation(argA, argB);
    }

}
