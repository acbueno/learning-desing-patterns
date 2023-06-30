package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

public interface Mediator {

    void openCall(String msg, Pilot pilot);

    void permissionLand(Pilot pilot, boolean authorization);

}
