package br.com.acbueno.learning.desing.patterns.behavioral.cor.game.copy;

public class FoodRequestHandler extends AbstractRequestHandler {

    @Override
    protected String[] wordList() {
        return new String[]{"food", "water", "rations", "hungry"};
    }

    @Override
    protected void handleRequest(String request) {
        System.out.println("Request handled by kitchen.");

    }

}
