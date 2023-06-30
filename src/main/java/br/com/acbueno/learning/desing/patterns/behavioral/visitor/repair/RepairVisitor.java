package br.com.acbueno.learning.desing.patterns.behavioral.visitor.repair;

public interface RepairVisitor {

    int visit(House house);

    int visit(Eletronic eletronic);

    int visit(Forniture forniture);

}
