package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.builder.demo;

import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.builder.PizzaBuilder;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.director.Director;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.product.Pizza;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();
        director.buildCalabresa(builder);
        Pizza pizza = builder.getResult();
        System.out.println(String.format("Sabor: %s", pizza.getTipoSabor().getName()));
        System.out.println(String.format("Massa: %s", pizza.getMassa().getDescription()));
        System.out.println(String.format("Assado no: %s", pizza.getTipoForno().getDescription()));
    }

}
