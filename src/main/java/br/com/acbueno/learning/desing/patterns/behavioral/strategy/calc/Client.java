package br.com.acbueno.learning.desing.patterns.behavioral.strategy.calc;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OpearationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        context = new Context(new OpeartionDivisor());
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
    }
}