package br.com.acbueno.learning.desing.patterns.structural.bridge.immobile;

public class Client {

    public static void main(String[] args) {
        Operation houseSell = new Sell(new House());
        System.out.println(houseSell.pretension());
        Operation rentBuildings = new Rent(new Building());
        System.out.println(rentBuildings.pretension());
    }

}
