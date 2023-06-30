package br.com.acbueno.learning.desing.patterns.structural.facade.orderfood;

public class OrderFacade {

    private Waiter waiter = new Waiter();
    private Kitchen kitchen = new Kitchen();

    public void orderFood() {
        waiter.takeOrder();
        waiter.takeOrderToCook();
        kitchen.cookFood();
        kitchen.signalRead();
        waiter.serverCustomer();
    }

}
