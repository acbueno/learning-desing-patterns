package br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox;

public class MacOSCheckBox implements CheckBox {

    @Override
    public void paint() {
       System.out.println("You have created MacOsCheckBox.");
    }

}
