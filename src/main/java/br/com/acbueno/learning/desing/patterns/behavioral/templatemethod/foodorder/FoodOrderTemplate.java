package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.foodorder;

public abstract class FoodOrderTemplate {

    void processOrder() {
        selectFood();
        cook();
        payment();
        delivery();
    }

    abstract void selectFood();

    abstract void cook();

    public void payment() {
        System.out.println("Payment food ok");
    }

    public void delivery() {
        System.out.println("Food deliery");
    }

}
