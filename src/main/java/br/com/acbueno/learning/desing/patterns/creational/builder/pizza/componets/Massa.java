package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets;

public enum Massa {
    MASSA_GROSSA(1, "massa grossa"),
    MASSA_FINA(2, "massa fina");

    private int code;

    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    private  Massa(int code, String description) {
        this.code = code;
        this.description = description;
    }

}
