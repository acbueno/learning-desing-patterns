package br.com.acbueno.learning.desing.patterns.behavioral.templatemethod.game;

public class Client {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Soccer();
        game.play();
    }

}
