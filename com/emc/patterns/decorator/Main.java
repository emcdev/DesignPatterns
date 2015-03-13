package com.emc.patterns.decorator;

class Main {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        component.doOperation();

        Component decoratedComponent = new DecoratedComponent(component);

        decoratedComponent.doOperation();

    }

}
