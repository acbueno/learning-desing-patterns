package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class Controller {

    private Command command;

    public void setComand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
