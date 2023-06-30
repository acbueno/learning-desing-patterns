package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

public interface MainteceHandler {

    public void setNextHandler(MainteceHandler handler);
    public void processRequest(String request);

}
