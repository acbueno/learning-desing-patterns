package br.com.acbueno.learning.desing.patterns.structural.flyweight.car;

import java.util.HashMap;
import java.util.Map;
import java.awt.Color;

public class VehicleFactory {

    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    private VehicleFactory() {
    }

    public static Vehicle createVehicle(Color color) {
        Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
            // Creates the new car.
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return newVehicle;
    }

}
