package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class TelevisionOffCommand implements Command {

    private Television television;

    public TelevisionOffCommand(Television television) {
       this.television = television;
    }

    @Override
    public void execute() {
        television.powerOff();
    }

}
