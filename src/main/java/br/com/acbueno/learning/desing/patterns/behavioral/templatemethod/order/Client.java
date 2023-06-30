package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.order;

public class Client {

    public static void main(String[] args) {
        OrderProcessTemplate netOrider = new NetOrder();
        netOrider.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder =new StoreOrder();
        storeOrder.processOrder(true);
    }

}
