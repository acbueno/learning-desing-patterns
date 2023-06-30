package br.com.acbueno.learning.desing.patterns.behavioral.strategy.route;

public class RouteMortorCicle implements RouteStrategy {

    private static final float mediaSpedd = 160;

    @Override
    public float calTimeRoute(float km) {
        if(km>mediaSpedd) {
            return km/mediaSpedd;
        }
        return mediaSpedd/km;
    }

}
