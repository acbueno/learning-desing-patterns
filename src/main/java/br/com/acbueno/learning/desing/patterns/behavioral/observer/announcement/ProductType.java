package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

public enum ProductType {
    CAR(1, "Car"),
    ELECTRONICS(2, "electronics"),
    CLOTHES(3, "clothes");

    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    private ProductType(int code, String description) {
        this.code = code;
        this.description = description;
    }

}
