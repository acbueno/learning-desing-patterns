package br.com.acbueno.learning.desing.patterns.behavioral.strategy.calc;

public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}
