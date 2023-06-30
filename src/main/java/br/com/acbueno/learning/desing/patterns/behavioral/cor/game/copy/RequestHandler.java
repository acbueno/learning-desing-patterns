package br.com.acbueno.learning.desing.patterns.behavioral.cor.game.copy;

public interface RequestHandler {

    public void setNextHandler(RequestHandler handler);
    public void processRequest(String request);


}
