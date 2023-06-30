package br.com.acbueno.learning.desing.patterns.behavioral.state.player;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Playear is an start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }

}
