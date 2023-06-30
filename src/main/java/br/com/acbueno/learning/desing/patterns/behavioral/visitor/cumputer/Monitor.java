package br.com.acbueno.learning.desing.patterns.behavioral.visitor.cumputer;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor visitor) {
       visitor.visit(this);
    }

}
