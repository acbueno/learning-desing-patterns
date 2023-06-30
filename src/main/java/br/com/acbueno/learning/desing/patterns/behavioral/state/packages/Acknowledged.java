package br.com.acbueno.learning.desing.patterns.behavioral.state.packages;

public class Acknowledged implements PackageState {

    private static Acknowledged instance = new Acknowledged();

    private Acknowledged() {

    }

    public static Acknowledged getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.getInstance());
    }

}
