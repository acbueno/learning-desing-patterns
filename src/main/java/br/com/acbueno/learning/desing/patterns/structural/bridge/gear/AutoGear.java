package br.com.acbueno.learning.desing.patterns.structural.bridge.gear;

public class AutoGear implements Gear {

    @Override
    public void handler() {
      System.out.println("AT - Caixa Automática");
    }

}
