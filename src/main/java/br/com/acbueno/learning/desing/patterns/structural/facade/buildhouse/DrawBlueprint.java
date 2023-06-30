package br.com.acbueno.learning.desing.patterns.structural.facade.buildhouse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrawBlueprint {

    private static final Logger LOGGER = LoggerFactory.getLogger(DrawBlueprint.class);

    public void build() {
        LOGGER.info("Draw Blueprint");
    }

}
