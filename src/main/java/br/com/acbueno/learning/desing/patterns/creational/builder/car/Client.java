package br.com.acbueno.learning.desing.patterns.creational.builder.car;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.CarBuilder;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.CarManualBuilder;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.director.Director;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.product.Car;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.product.Manual;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildCityCart(builder);
        Car car = builder.getResult();
        System.out.println("Car built :\n" + car.getCarType());
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.buildCityCart(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar Manual built:\n" + carManual.print());
    }

}
