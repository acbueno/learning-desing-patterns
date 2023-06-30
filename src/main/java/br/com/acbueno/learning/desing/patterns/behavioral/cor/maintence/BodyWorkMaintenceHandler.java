package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BodyWorkMaintenceHandler extends MaintenceAbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(BodyWorkMaintenceHandler.class);

    @Override
    protected String requestOperation() {
        return MaintenceType.BODYWORK.getDescriptionName();
    }

    @Override
    protected void handlerRequest(String request) {
        LOGGER.info("Request handled by auto bodywork maintenance");
        LOGGER.info("Repair body");
        LOGGER.info("Paint body");
    }

}
