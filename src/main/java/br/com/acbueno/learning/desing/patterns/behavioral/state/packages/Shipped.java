package br.com.acbueno.learning.desing.patterns.behavioral.state.packages;

public class Shipped implements PackageState {

    private static Shipped instance = new Shipped();

    private Shipped() {

    }

    public static Shipped getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
       System.out.println("Package is shipped !!");
       ctx.setCurrentState(InTransition.getInstance());
    }

}
