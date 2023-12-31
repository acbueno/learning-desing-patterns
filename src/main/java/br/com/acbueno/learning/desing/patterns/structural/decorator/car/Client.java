package br.com.acbueno.learning.desing.patterns.structural.decorator.car;

public class Client {

    public static void main(String[] args) {
        Car sportCar = new SportsCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n******");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
