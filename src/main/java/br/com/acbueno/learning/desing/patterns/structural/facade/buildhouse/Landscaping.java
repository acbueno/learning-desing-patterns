package br.com.acbueno.learning.desing.patterns.structural.facade.buildhouse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Landscaping {

    private static final Logger LOGGER = LoggerFactory.getLogger(Landscaping.class);

    public void build() {
        LOGGER.info("Landscaping ready");
    }

}
