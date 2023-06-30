package br.com.acbueno.learning.desing.patterns.behavioral.state.packages;

public class Delivered implements PackageState {

    private static Delivered instance = new Delivered();

    private Delivered() {

    }

    public static Delivered getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
      System.out.println("Package is delivered!!");
    }

}
