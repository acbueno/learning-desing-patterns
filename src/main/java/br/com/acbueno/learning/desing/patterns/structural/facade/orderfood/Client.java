package br.com.acbueno.learning.desing.patterns.structural.facade.orderfood;

public class Client {

    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.orderFood();
    }

}
