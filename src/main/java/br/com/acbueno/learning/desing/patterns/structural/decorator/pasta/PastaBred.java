package br.com.acbueno.learning.desing.patterns.structural.decorator.pasta;

public class PastaBred extends PastaDecorator {

    public PastaBred(Pasta pasta) {
        super(pasta);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("for bread. ");
    }

}
