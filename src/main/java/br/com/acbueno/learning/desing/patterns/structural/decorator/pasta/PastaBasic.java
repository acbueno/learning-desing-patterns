package br.com.acbueno.learning.desing.patterns.structural.decorator.pasta;

public class PastaBasic implements Pasta {

    @Override
    public void assemble() {
       System.out.print("Pasta Basic. ");
    }

}
