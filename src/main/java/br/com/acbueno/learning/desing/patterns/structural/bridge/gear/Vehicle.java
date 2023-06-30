package br.com.acbueno.learning.desing.patterns.structural.bridge.gear;

public abstract class Vehicle {

    Gear gear;

    public Vehicle(Gear gear) {
        this.gear = gear;
    }

    abstract void addGear();

}
