package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class TelevisonChannelCommand implements Command {

    private Television television;

    public TelevisonChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.setChannel(440);
    }

}
