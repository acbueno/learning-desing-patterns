package br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.product.Car;

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }

}
