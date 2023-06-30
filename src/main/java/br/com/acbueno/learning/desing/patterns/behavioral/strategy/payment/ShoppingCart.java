package br.com.acbueno.learning.desing.patterns.behavioral.strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public double sumTotal() {
        double sum = 0;
        for (Product product : products) {
             sum +=product.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        double amount = sumTotal();
        paymentMethod.pay(amount);
    }

}
