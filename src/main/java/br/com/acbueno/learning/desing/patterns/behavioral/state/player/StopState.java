package br.com.acbueno.learning.desing.patterns.behavioral.state.player;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }

}
