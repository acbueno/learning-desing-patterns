package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

public abstract class Pilot {

    private Mediator mediator;
    private Aircraft aircraft;

    protected Pilot(Mediator mediator, Aircraft aircraft) {
        this.mediator = mediator;
        this.aircraft = aircraft;
    }

    public abstract void callControlTower(Pilot pilot, String message);

    public abstract void callAuthorizationland(Pilot pilot, boolean authorization);

    @Override
    public String toString() {
        return "Flight [aircraft-prefix=" + aircraft.getPrefix() + " Port Origin: " + aircraft.getFlight().getAirPortFrom() + "]";
    }

}
