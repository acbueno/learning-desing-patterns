package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.order;

public abstract class OrderProcessTemplate {

    boolean isGift;

    abstract void doSelect();

    abstract void doPayment();

    public final void giftWrap() {
        try {
            System.out.println("Gift wrap successful");
        } catch (Exception e) {
            System.out.println("Gift wrap unsuccessful");
        }
    }

    public abstract void doDelivery();

    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();

        if(isGift) {
            giftWrap();
        }
        doDelivery();
    }

}
