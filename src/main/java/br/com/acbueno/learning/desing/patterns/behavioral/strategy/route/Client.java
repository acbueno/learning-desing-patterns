package br.com.acbueno.learning.desing.patterns.behavioral.strategy.route;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new RouteByBus());
        System.out.println(String.format("Tempo com ônibus %s", context.executeStrategy(100)));
        context = new Context(new RouteCar());
        System.out.println(String.format("Tempo com carro %s", context.executeStrategy(100)));
        context = new Context(new RouteMortorCicle());
        System.out.println(String.format("Tempo com moto %s", context.executeStrategy(100)));
        context = new Context(new RouteOnFoot());
        System.out.println(String.format("Tempo caminhado %s", context.executeStrategy(100)));
    }

}
