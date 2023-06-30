package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ControlTower();
        Flight flightSaoPaulo = new Flight();
        flightSaoPaulo.setAirPortFrom("Sao Paulo");
        flightSaoPaulo.setAirPortOrgim("Campinas");
        flightSaoPaulo.setFlightTakeoffTime("12:00");
        flightSaoPaulo.setFlightArrivalTime("13:00");
        flightSaoPaulo.setFlighCode("PR-50");
        Aircraft aircraft1 = new Aircraft();
        aircraft1.setCompany("GOL");
        aircraft1.setFlight(flightSaoPaulo);
        aircraft1.setPrefix("XPTO");
        Pilot pilot1 = new PilotImpl(mediator, aircraft1);
        mediator.openCall("Pedido para pousar", pilot1);
        mediator.permissionLand(pilot1, true);

        Flight flightRj = new Flight();
        flightRj.setAirPortOrgim("Campinas");
        flightRj.setAirPortFrom("Rio de Janeiro");
        flightRj.setFlightTakeoffTime("14:00");
        flightRj.setFlightArrivalTime("15:00");
        flightRj.setFlighCode("123");
        Aircraft aircraft2 = new Aircraft();
        aircraft1.setCompany("LATAM");
        aircraft1.setPrefix("XPTO2");
        aircraft1.setFlight(flightRj);
        Pilot pilot2 = new PilotImpl(mediator, aircraft2);
        mediator.openCall("Pedido para pusar", pilot2);
        mediator.permissionLand(pilot2, false);

    }

}
