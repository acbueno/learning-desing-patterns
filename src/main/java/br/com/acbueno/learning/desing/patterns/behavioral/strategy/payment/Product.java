package br.com.acbueno.learning.desing.patterns.behavioral.strategy.payment;

public class Product {

    private String upCode;
    private double price;

    public Product(String upCode, double price) {
        super();
        this.upCode = upCode;
        this.price = price;
    }

    public String getUpCode() {
        return upCode;
    }

    public double getPrice() {
        return price;
    }

}
