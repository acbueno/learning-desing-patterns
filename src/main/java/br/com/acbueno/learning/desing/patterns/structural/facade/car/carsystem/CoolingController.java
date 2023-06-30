package br.com.acbueno.learning.desing.patterns.structural.facade.car.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CoolingController.class);

    private static final Integer DEFAULT_RADIATOR_SPEED = 10;

    private Integer temperatureUpperLimit;

    private Radiator radiator = new Radiator();

    private TemperatureSensor temperatureSensor = new TemperatureSensor();


    public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
        LOGGER.info(String.format("Setting temperature upper limit to %s", temperatureUpperLimit));
        this.temperatureUpperLimit = temperatureUpperLimit;
    }


    public void run() {
        LOGGER.info("Cooling controller ready!");
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
    }

    public void cool(Integer maxAllowedTemp) {
        LOGGER.info(String.format("Scheduled  cooling with maximum allowed temperature %s", maxAllowedTemp));
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        LOGGER.info("Stopping Cooling Controller..");
        radiator.off();
    }

}
