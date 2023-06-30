package br.com.acbueno.learning.desing.patterns.structural.bridge.gear;

public class Truck extends Vehicle {

    public Truck(Gear gear) {
        super(gear);
    }

    @Override
    void addGear() {
        System.out.print("Tipo: ");
        gear.handler();
    }

}
