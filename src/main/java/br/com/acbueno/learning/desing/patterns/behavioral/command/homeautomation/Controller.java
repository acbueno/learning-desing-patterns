package br.com.acbueno.learning.desing.patterns.behavioral.command.homeautomation;

public class Controller {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
