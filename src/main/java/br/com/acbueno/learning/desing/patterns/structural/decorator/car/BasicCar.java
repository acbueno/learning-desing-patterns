package br.com.acbueno.learning.desing.patterns.structural.decorator.car;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }

}
