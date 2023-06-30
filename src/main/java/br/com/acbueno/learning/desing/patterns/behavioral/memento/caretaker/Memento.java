package br.com.acbueno.learning.desing.patterns.behavioral.memento.caretaker;

public class Memento {

    private String state;

    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
