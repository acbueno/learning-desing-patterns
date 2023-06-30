package br.com.acbueno.learning.desing.patterns.behavioral.visitor.cumputer;

public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);

}
