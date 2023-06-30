package br.com.acbueno.learning.desing.patterns.structural.facade.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.acbueno.learning.desing.patterns.structural.facade.car.carsystem.CarEngineFacade;

public class Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws InterruptedException {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        Thread.sleep(100);
        LOGGER.info("---Start car---");
        carEngineFacade.startEngine();
        Thread.sleep(50);
        LOGGER.info("---Stop car---");
        carEngineFacade.stopEngine();
    }

}
