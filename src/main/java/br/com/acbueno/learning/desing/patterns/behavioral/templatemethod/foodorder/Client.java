package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.foodorder;

public class Client {

    public static void main(String[] args) {
        FoodOrderTemplate pizzaFood = new PizzaFood();
        pizzaFood.processOrder();
        System.out.println();
        FoodOrderTemplate foodHotDog = new FoodHotDog();
        foodHotDog.processOrder();
    }

}
