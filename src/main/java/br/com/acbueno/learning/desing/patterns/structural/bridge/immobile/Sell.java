package br.com.acbueno.learning.desing.patterns.structural.bridge.immobile;

public class Sell extends Operation {

    public Sell(Build build) {
        super(build);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String pretension() {
        return build.builderImmobile() + " for sell";
    }

}
