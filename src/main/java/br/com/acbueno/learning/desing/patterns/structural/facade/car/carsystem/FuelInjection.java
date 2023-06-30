package br.com.acbueno.learning.desing.patterns.structural.facade.car.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelInjection {

    private static final Logger LOGGER = LoggerFactory.getLogger(FuelInjection.class);
    private FuelPump fuelPump = new FuelPump();

    public void on() {
        LOGGER.info("Fuel injector ready to injetion fuel.");
    }

    public void inject() {
        fuelPump.pump();
        LOGGER.info("Fuel Injection.");
    }

    public void off() {
        LOGGER.info("Stopping Fuel Injector");
    }


}
