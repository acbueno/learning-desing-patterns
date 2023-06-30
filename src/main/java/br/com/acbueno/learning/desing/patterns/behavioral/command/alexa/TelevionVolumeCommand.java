package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class TelevionVolumeCommand implements Command {

    private Television television;

    public TelevionVolumeCommand(Television television) {
       this.television = television;
    }

    @Override
    public void execute() {
       television.setVolume(10);
    }

}
