package br.com.acbueno.learning.desing.patterns.behavioral.cor.game;

public class Client {

    public static RequestHandler getHandlerChain() {
        RequestHandler food = new FoodRequestHandler();
        RequestHandler medic = new MedicRequestHandler();
        RequestHandler evac = new EvacuationRequestHandler();
        RequestHandler aerial = new AerialSupportRequestHandler();
        RequestHandler operator = new OperatorRequestHandler();

        food.setNextHandler(medic);
        medic.setNextHandler(evac);
        evac.setNextHandler(aerial);
        aerial.setNextHandler(operator);

        return food;
    }

    public static void main(String[] args) {

        RequestHandler chain = getHandlerChain();
        String request = "We need aerial support!";
        System.out.println(request);
        chain.processRequest(request);

        request = "We're hungry!";
        System.out.println(request);
        chain.processRequest(request);

        request = "We're lost and confused!";
        System.out.println(request);
        chain.processRequest(request);

    }

}
