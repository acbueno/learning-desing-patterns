package br.com.acbueno.learning.desing.patterns.behavioral.state.carmanufacturing;

public class BodyShopState implements ManufacturingState {

    private static BodyShopState instance = new BodyShopState();

    private BodyShopState() {

    }

    public static BodyShopState getInstance() {
        return instance;
    }

    @Override
    public void updateState(ManufacturingContext ctx) {
        System.out.println("Repaired body shop");
        ctx.setManufacturingState(PaintShopState.getIstance());
    }

}
