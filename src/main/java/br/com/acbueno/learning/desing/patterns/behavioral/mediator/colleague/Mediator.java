package br.com.acbueno.learning.desing.patterns.behavioral.mediator.colleague;

public interface Mediator {

    void register(Colleague colleague);

    void unRegister(Colleague colleague);

}
