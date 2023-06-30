package br.com.acbueno.learning.desing.patterns.behavioral.strategy.route;

public class RouteOnFoot implements RouteStrategy {

    private static final int speedMedia = 8;

    @Override
    public float calTimeRoute(float km) {
        if (km > speedMedia) {
            return km/speedMedia;
        }
        return speedMedia/km;
    }

}
