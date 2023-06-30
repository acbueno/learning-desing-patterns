package br.com.acbueno.learning.desing.patterns.behavioral.visitor.cumputer;

public interface ComputerPart {

    public void accept(ComputerPartVisitor visitor);

}
