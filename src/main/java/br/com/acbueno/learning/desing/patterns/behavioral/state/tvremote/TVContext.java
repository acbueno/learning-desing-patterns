package br.com.acbueno.learning.desing.patterns.behavioral.state.tvremote;

public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState=state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
       this.tvState.doAction();

    }

}
