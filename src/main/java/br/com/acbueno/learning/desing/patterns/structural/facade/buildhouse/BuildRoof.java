package br.com.acbueno.learning.desing.patterns.structural.facade.buildhouse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuildRoof {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildRoof.class);

    public void build() {
        LOGGER.info("Build Roof");
    }

}
