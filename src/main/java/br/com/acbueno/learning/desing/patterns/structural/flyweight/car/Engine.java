package br.com.acbueno.learning.desing.patterns.structural.flyweight.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Engine {

    private final static Logger LOG = LoggerFactory.getLogger(Engine.class);

    public void start() {
        LOG.info("Engine is starting");
    }

    public void stop() {
        LOG.info("Engine is stopping!");
    }



}
