package br.com.acbueno.learning.desing.patterns.behavioral.state.carmanufacturing;

public class Client {

    public static void main(String[] args) {
        ManufacturingContext ctx = new ManufacturingContext(null, "nissa-01");
        System.out.println("Start state first");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();

        ManufacturingContext ct1 = new ManufacturingContext(PaintShopState.getIstance(), "nissa-02");
        System.out.println("Start state third");
        ct1.update();
        ct1.update();
    }

}
