package br.com.acbueno.learning.desing.patterns.behavioral.state.packages;

public class Client {

    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext(null, "teste01");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }

}
