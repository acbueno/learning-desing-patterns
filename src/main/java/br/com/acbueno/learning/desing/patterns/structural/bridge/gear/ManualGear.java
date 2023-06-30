package br.com.acbueno.learning.desing.patterns.structural.bridge.gear;

public class ManualGear implements Gear {

    @Override
    public void handler() {
        System.out.println("MT - Caixa Manual");
    }

}
