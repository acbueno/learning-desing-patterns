package br.com.acbueno.learning.desing.patterns.behavioral.visitor.book;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);

}
