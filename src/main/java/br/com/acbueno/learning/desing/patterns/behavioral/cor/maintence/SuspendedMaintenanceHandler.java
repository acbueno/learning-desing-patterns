package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuspendedMaintenanceHandler extends MaintenceAbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SuspendedMaintenanceHandler.class);

    @Override
    protected String requestOperation() {
        return MaintenceType.SUSPENSION.getDescriptionName();
    }

    @Override
    protected void handlerRequest(String request) {
        LOGGER.info("Request handled by Auto suspension maintenance");
        LOGGER.info("Tire change");
        LOGGER.info("Maintenance brakes");
        LOGGER.info("Exchange of shock absorbers");
    }

}
