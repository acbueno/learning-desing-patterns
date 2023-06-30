package br.com.acbueno.learning.desing.patterns.structural.bridge.immobile;

public abstract class Operation {

    protected Build build;

    public Operation(Build build) {
        this.build = build;
    }

    public abstract String pretension();

}
