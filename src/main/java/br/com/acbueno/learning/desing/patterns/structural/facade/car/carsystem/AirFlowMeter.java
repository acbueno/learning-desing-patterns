package br.com.acbueno.learning.desing.patterns.structural.facade.car.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirFlowMeter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AirFlowMeter.class);

    public void getMeasurements() {
        LOGGER.info("Getting air measurament");
    }

}
