package br.com.acbueno.learning.desing.patterns.behavioral.strategy.route;

public class Context {

    private RouteStrategy routeStrategy;

    public Context(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public float executeStrategy(float distanceKm) {
        return routeStrategy.calTimeRoute(distanceKm);
    }

}
