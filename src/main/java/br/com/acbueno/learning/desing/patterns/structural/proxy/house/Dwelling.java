package br.com.acbueno.learning.desing.patterns.structural.proxy.house;

public enum Dwelling {
    HOUSE(1, "House"),
    APARMENT(2, "Apartament");

    private int code;

    private String name;

    private Dwelling(int code, String name) {
        this.code = code;
        this.name = name;
    }


}
