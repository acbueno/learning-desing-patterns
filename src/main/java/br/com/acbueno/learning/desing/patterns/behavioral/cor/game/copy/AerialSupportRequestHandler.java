package br.com.acbueno.learning.desing.patterns.behavioral.cor.game.copy;

public class AerialSupportRequestHandler extends AbstractRequestHandler {

    @Override
    protected String[] wordList() {
        return new String[]{"bombing", "aerial"};
    }

    @Override
    protected void handleRequest(String request) {
        System.out.println("Request handled by aerial support.");
    }

}
