package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.game;

public class Soccer extends Game {

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");

    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");

    }

    @Override
    void endPlay() {
       System.out.println("Football Game Finished!");
    }

}
