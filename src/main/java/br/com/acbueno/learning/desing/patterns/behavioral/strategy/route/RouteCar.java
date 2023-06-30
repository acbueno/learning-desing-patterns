package br.com.acbueno.learning.desing.patterns.behavioral.strategy.route;

public class RouteCar implements RouteStrategy {

    private static final int mediaSpeed = 120;

    @Override
    public float calTimeRoute(float km) {
        if(km>mediaSpeed) {
            return km/mediaSpeed;
        }
        return mediaSpeed/km;
    }

}
