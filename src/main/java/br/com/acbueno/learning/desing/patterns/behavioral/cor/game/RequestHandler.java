package br.com.acbueno.learning.desing.patterns.behavioral.cor.game;

public interface RequestHandler {

    public void setNextHandler(RequestHandler handler);
    public void processRequest(String request);


}
