package br.com.acbueno.learning.desing.patterns.creational.prototype.car;

import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car cars = new Car();
        cars.loadData();

        Car newCar0 = (Car) cars.clone();
        Car newCar1 = (Car) cars.clone();
        List<String> list = newCar0.getListCar();
        list.add("Corcel");
        List<String> list1 = newCar1.getListCar();
        list1.add("Corsa");

        System.out.println(String.format("Car list %s", cars.getListCar()));
        System.out.println(String.format("Cars new list %s", list));
        System.out.println(String.format("Cars new list %s", list1));
    }

}
