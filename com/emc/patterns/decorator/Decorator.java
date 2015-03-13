package com.emc.patterns.decorator;

public class Decorator implements Component {

    private final Component component;

    public Decorator(Component component) {
        this.component = component;

    }

    @Override
    public void doOperation() {
        component.doOperation();
    }
}
