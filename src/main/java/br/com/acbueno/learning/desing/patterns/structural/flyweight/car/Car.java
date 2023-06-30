package br.com.acbueno.learning.desing.patterns.structural.flyweight.car;

import java.awt.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Vehicle {

    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);

    private Engine engine;

    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LOGGER.error("Error while creating a new car", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void start() {
       LOGGER.info("Car is starting");
       engine.start();
    }

    @Override
    public void stop() {
        LOGGER.info("Car is stopping!");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", color=" + color + "]";
    }

}
