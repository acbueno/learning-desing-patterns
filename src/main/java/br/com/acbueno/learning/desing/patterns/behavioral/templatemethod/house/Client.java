package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.house;

public class Client {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();
        System.out.println("************");
        houseType = new GlassHouse();
        houseType.buildHouse();
    }

}
