package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.order;

public class NetOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("Item added to online shopping cart");
        System.out.println("Get gift wrap preference");
        System.out.println("Get delivery address.");
    }

    @Override
    void doPayment() {
        System.out.println("Online Payment through Netbanking, card or Paytm");

    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through post to delivery address");
    }

}
