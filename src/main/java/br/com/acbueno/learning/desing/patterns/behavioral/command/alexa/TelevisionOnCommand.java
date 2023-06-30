package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class TelevisionOnCommand implements Command {

    private Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.powerOn();
    }

}
