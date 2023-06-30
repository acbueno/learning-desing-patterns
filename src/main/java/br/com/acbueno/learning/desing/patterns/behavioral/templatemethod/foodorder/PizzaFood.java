package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.foodorder;

public class PizzaFood extends FoodOrderTemplate {

    @Override
    void selectFood() {
        System.out.println("Select a Pizza");

    }

    @Override
    void cook() {
        System.out.println("Cook a Pizza");
    }

}
