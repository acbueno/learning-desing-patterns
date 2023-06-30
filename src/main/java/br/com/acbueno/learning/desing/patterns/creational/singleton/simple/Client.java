package br.com.acbueno.learning.desing.patterns.creational.singleton.simple;

public class Client {

    public static void main(String[] args) {
        System.out.println("Se valores forem iguais está correto singleton " + "\n" +
                "Se valores forem diferentes foi criado outra instancia" + "\n\n" +
                "RESULT:" + "\n");
        CarSingleSimple singleton = CarSingleSimple.getInstance("Tucson");
        CarSingleSimple anotherSingleton = CarSingleSimple.getInstance("Meriva");
        System.out.println(singleton.getModelName());
        System.out.println(anotherSingleton.getModelName());
    }

}
