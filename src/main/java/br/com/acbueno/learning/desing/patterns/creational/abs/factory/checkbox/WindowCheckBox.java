package br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox;

public class WindowCheckBox implements CheckBox {

    @Override
    public void paint() {
      System.out.println("You have created WindowCheckBox");
    }

}
