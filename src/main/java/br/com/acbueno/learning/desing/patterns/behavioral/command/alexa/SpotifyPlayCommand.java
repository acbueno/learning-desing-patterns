package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class SpotifyPlayCommand implements Command {

    private Spotify spotify;

    public SpotifyPlayCommand(Spotify spotify) {
        this.spotify = spotify;
    }

    @Override
    public void execute() {
        spotify.playMusic();
    }

}
