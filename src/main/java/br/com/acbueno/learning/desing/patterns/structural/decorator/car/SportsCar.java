package br.com.acbueno.learning.desing.patterns.structural.decorator.car;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sport Car");
    }

}
