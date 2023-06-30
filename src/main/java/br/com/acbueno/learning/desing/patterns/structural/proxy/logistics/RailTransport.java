package br.com.acbueno.learning.desing.patterns.structural.proxy.logistics;

public class RailTransport implements TransportationLogistics {

    @Override
    public void trasnport() {
       System.out.println("Product sent by rail transport");
    }

}
