package br.com.acbueno.learning.desing.patterns.structural.proxy.logistics;

public class AirTransport implements TransportationLogistics {

    @Override
    public void trasnport() {
        System.out.println("Product sent for air transport.");
    }

}
