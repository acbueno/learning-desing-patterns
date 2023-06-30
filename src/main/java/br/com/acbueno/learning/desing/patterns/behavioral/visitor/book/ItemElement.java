package br.com.acbueno.learning.desing.patterns.behavioral.visitor.book;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);

}
