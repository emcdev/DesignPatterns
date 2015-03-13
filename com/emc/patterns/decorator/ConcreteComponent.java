package com.emc.patterns.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void doOperation() {
        System.out.println("Execute the operation");
    }

}
