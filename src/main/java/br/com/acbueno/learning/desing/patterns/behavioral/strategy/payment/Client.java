package br.com.acbueno.learning.desing.patterns.behavioral.strategy.payment;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("1234", 50.00);
        Product product2 = new Product("456", 120.00);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.pay(new PaypalStrategy("rambo@gmail.com", "passwd"));
        cart.pay(new CreditCardStrategy("Rambo Rambo", "12345544545", "786", "12/28"));
    }

}
