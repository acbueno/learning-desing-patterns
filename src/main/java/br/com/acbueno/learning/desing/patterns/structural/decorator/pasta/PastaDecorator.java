package br.com.acbueno.learning.desing.patterns.structural.decorator.pasta;

public class PastaDecorator implements Pasta {

    protected Pasta pasta;

    public PastaDecorator(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public void assemble() {
       this.pasta.assemble();
    }
}
