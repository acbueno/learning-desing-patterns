package br.com.acbueno.learning.desing.patterns.structural.bridge.immobile;

public class Rent extends Operation {

    public Rent(Build build) {
        super(build);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String pretension() {
        return build.builderImmobile() + " for rent";
    }

}
