package br.com.acbueno.learning.desing.patterns.behavioral.state.tvremote;

public class TVStopState implements State {

    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}
