package br.com.acbueno.learning.desing.patterns.behavioral.cor.game.copy;

public class MedicRequestHandler extends AbstractRequestHandler {

    @Override
    protected String[] wordList() {
        return new String[]{"medic", "medicine", "doctor"};
    }

    @Override
    protected void handleRequest(String request) {
        System.out.println("Request handled by medical department.");
    }

}
