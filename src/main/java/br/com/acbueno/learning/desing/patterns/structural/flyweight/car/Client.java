package br.com.acbueno.learning.desing.patterns.structural.flyweight.car;

import java.awt.Color;

public class Client {

    public static void main(String[] args) {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);

        System.out.println(String.format("Car: %s", blackVehicle.getColor()));
    }

}
