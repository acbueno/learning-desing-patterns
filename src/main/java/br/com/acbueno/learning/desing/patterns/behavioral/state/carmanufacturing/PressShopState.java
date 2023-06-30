package br.com.acbueno.learning.desing.patterns.behavioral.state.carmanufacturing;

public class PressShopState implements ManufacturingState {

    private static PressShopState instance = new PressShopState();

    private PressShopState() {

    }

    public static PressShopState getInstance() {
        return instance;
    }

    @Override
    public void updateState(ManufacturingContext ctx) {
        System.out.println("press shop ready");
        ctx.setManufacturingState(BodyShopState.getInstance());
    }

}
