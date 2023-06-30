package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.foodorder;

public class FoodHotDog extends FoodOrderTemplate {

    @Override
    void selectFood() {
       System.out.println("Select a Hot Dog");

    }

    @Override
    void cook() {
       System.out.println("Cook a Hot Dog");
    }

}
