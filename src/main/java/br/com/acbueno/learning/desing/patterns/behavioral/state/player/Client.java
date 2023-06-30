package br.com.acbueno.learning.desing.patterns.behavioral.state.player;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        StartState startState =new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }

}
