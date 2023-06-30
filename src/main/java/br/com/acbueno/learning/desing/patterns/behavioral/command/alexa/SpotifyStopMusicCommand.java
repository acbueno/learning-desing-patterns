package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class SpotifyStopMusicCommand implements Command {

    private Spotify spotify;

    public SpotifyStopMusicCommand(Spotify spotify) {
       this.spotify = spotify;
    }

    @Override
    public void execute() {
        spotify.stopMusic();
    }



}
