package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MechanicsMaintenceHandler extends MaintenceAbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MechanicsMaintenceHandler.class);

    @Override
    protected String requestOperation() {
        return MaintenceType.MECHANICS.getDescriptionName();
    }

    @Override
    protected void handlerRequest(String request) {
        LOGGER.info("Request handled by auto mechanics maintenance");
        LOGGER.info("Timing belt change");
        LOGGER.info("Exchange cushion engine");
        LOGGER.info("Engine head gasket replacement");
    }

}
