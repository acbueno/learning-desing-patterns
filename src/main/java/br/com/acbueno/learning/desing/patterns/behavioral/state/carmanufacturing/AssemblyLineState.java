package br.com.acbueno.learning.desing.patterns.behavioral.state.carmanufacturing;

public class AssemblyLineState implements ManufacturingState {

    private static AssemblyLineState instance = new AssemblyLineState();

    private AssemblyLineState() {

    }

    public static AssemblyLineState getInstance() {
        return instance;
    }

    @Override
    public void updateState(ManufacturingContext ctx) {
        System.out.println("Manufactured car");

    }

}
