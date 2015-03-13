package com.emc.patterns.decorator;

public class DecoratedComponent extends Decorator {

    public DecoratedComponent(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        doExtraOperation();
    }

    private void doExtraOperation() {
        System.out.println("Execute extra operation");
    }

}
