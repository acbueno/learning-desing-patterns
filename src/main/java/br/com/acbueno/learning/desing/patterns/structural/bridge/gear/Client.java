package br.com.acbueno.learning.desing.patterns.structural.bridge.gear;

public class Client {

    public static void main(String[] args) {
        Gear gear = new ManualGear();
        Vehicle vehicle = new Car(gear);
        vehicle.addGear();

        gear = new AutoGear();
        vehicle = new Car(gear);
        vehicle.addGear();

        gear = new ManualGear();
        vehicle = new Truck(gear);
        vehicle.addGear();

        gear = new AutoGear();
        vehicle = new Truck(gear);
        vehicle.addGear();
    }

}
