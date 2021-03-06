package com.emc.patterns.decorator;

abstract class Decorator implements Component {

    private final Component component;

    Decorator(Component component) {
        // test
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

}
