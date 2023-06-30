package br.com.acbueno.learning.desing.patterns.behavioral.state.carmanufacturing;

public class PaintShopState implements ManufacturingState {

    private static PaintShopState instance = new PaintShopState();

    private PaintShopState() {

    }

    public static PaintShopState getIstance() {
        return instance;
    }

    @Override
    public void updateState(ManufacturingContext ctx) {
        System.out.println("Car is painted!!");
        ctx.setManufacturingState(AssemblyLineState.getInstance());
    }

}
