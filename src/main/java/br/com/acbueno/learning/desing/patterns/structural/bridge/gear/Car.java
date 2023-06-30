package br.com.acbueno.learning.desing.patterns.structural.bridge.gear;

public class Car extends Vehicle {

    public Car(Gear gear) {
        super(gear);
    }

    @Override
    void addGear() {
        System.out.print("Tipo: ");
        gear.handler();
    }

}
