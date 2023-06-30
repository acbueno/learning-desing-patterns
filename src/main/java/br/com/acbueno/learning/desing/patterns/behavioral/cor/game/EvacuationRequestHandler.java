package br.com.acbueno.learning.desing.patterns.behavioral.cor.game;

public class EvacuationRequestHandler extends AbstractRequestHandler {

    @Override
    protected String[] wordList() {
        return new String[]{"evac", "evacuation"};
    }

    @Override
    protected void handleRequest(String request) {
        System.out.println("Request handled by evacuations.");
    }

}
