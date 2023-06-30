package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets;

public enum TipoForno {
    FORNO_LENHA(1, "Forno a lenha"),
    FORNO_ELETRICO(2, "Forno elétrico"),
    FORNO_GAS(3, "Forno a gás");

    private int code;

    private String description;

    private TipoForno(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
