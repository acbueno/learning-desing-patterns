package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EletricalMaintenceHandler extends MaintenceAbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(EletricalMaintenceHandler.class);

    @Override
    protected String requestOperation() {
        return MaintenceType.ELECTRIC.getDescriptionName();
    }

    @Override
    protected void handlerRequest(String request) {
        LOGGER.info("Request handled by auto eletrical maintenance");
        LOGGER.info("Change sparks");
        LOGGER.info("Change cables");
    }

}
