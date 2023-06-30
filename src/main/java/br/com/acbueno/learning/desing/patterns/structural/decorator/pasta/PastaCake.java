package br.com.acbueno.learning.desing.patterns.structural.decorator.pasta;

public class PastaCake extends PastaDecorator {

    public PastaCake(Pasta pasta) {
        super(pasta);
    }

    public void assemble() {
        super.assemble();
        System.out.print("for cake. ");
    }

}
