package br.com.acbueno.learning.desing.patterns.behavioral.cor.game.copy;

public class OperatorRequestHandler extends AbstractRequestHandler {

    @Override
    protected String[] wordList() {
        return new String[0];
    }

    @Override
    protected void handleRequest(String request) {
        System.out.println("Request handled by operator.");
    }

}
