package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets;

public enum TipoSabor {
    CALABRESA(1, "Calabresa"),
    PORTUGUESA(2, "Portuguesa"),
    MARGUERITA(3, "Marguerita"),
    FRANGO_COM_CATUPIRY(4,"Frango com catupiry"),
    MUÇARELA(5, "Muçarela");

    private int code;

    private String name;

    private TipoSabor(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
