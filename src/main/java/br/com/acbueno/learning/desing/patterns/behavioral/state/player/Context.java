package br.com.acbueno.learning.desing.patterns.behavioral.state.player;

public class Context {

    private State state;

    public Context() {
       this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
