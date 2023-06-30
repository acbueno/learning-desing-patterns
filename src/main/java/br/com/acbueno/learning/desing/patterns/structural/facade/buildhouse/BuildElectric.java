package br.com.acbueno.learning.desing.patterns.structural.facade.buildhouse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildElectric {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildElectric.class);

    public void build() {
        LOGGER.info("Build Electric");
    }

}
