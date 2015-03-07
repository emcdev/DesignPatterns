package com.emc.patterns.strategy;

public class Context {

    Strategy strategy;

    public Context() {
        super();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(int argA, int argB) {
        strategy.doOperation(argA, argB);
    }

}
