package br.com.acbueno.learning.desing.patterns.creational.abs.factory.button;

public class WindowButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowButton.");
    }

}
