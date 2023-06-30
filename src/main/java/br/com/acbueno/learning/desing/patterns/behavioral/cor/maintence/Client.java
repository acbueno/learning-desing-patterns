package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static MainteceHandler getHandlerChain() {
        MainteceHandler mechanics = new MechanicsMaintenceHandler();
        MainteceHandler eletrical = new EletricalMaintenceHandler();
        MainteceHandler bodyWork = new BodyWorkMaintenceHandler();
        MainteceHandler supendend = new SuspendedMaintenanceHandler();
        mechanics.setNextHandler(eletrical);
        eletrical.setNextHandler(supendend);
        supendend.setNextHandler(bodyWork);

        return mechanics;
    }

    public static void main(String[] args) {
        MainteceHandler chain = getHandlerChain();
        String request = MaintenceType.MECHANICS.getDescriptionName();
        LOGGER.info(request);
        chain.processRequest(request);
        request = MaintenceType.ELECTRIC.getDescriptionName();
        LOGGER.info(request);
        chain.processRequest(request);
        request = MaintenceType.BODYWORK.getDescriptionName();
        LOGGER.info(request);
        chain.processRequest(request);
        request = MaintenceType.SUSPENSION.getDescriptionName();
        LOGGER.info(request);
        chain.processRequest(request);
    }

}
