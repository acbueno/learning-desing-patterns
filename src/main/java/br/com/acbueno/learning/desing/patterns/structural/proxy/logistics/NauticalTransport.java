package br.com.acbueno.learning.desing.patterns.structural.proxy.logistics;

public class NauticalTransport implements TransportationLogistics {

    @Override
    public void trasnport() {
      System.out.println("Product sent by nautical transport");
    }

}
