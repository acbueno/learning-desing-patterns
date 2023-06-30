package br.com.acbueno.learning.desing.patterns.behavioral.strategy.payment;

public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(String.format("%s paid using PayPal", amount));
    }

}
