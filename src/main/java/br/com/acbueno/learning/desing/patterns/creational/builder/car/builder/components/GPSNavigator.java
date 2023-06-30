package br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
       this.route = "120, Av Paulista, São Paulo, Brasil";
    }

    GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

}
