package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

public class PilotImpl extends Pilot {

    protected PilotImpl(Mediator mediator, Aircraft aircraft) {
        super(mediator, aircraft);
    }

    private Mediator mediator;

    @Override
    public void callControlTower(Pilot pilot, String call) {
        System.out.println(String.format("Msg: %s : from %s",call , pilot.toString()));
    }

    @Override
    public void callAuthorizationland(Pilot pilot, boolean authorization) {
        String auth  = authorization ? "sim" : "não";
        System.out.println(String.format("Pedido pouso autorizado :%s", auth ,pilot));
    }


}
