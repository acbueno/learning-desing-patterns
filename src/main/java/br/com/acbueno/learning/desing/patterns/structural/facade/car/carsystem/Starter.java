package br.com.acbueno.learning.desing.patterns.structural.facade.car.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starter {

    private final static Logger LOGGER = LoggerFactory.getLogger(Starter.class);

    public void start() {
        LOGGER.info("Starting....");
    }

}
