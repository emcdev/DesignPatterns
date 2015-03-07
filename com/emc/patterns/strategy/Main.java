package com.emc.patterns.strategy;

class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Behavior dog = new DogBehavior();
        animal.setBehavior(dog);
        animal.showBehavior();

        Behavior cat = new CatBehavior();
        animal.setBehavior(cat);
        animal.showBehavior();

    }

}
