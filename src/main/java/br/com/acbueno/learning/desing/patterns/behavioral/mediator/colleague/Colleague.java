package br.com.acbueno.learning.desing.patterns.behavioral.mediator.colleague;

public abstract class Colleague {

    private Mediator mediator;
    private String name;

    protected Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receiveRegisterNotification(Colleague colleague);

    public abstract void receiveURegisterNotification(Colleague colleague);

    @Override
    public String toString() {
        return "Colleague [name=" + name + "]";
    }

}
