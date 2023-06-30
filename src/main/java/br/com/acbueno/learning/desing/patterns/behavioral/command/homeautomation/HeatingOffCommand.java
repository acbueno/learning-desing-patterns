package br.com.acbueno.learning.desing.patterns.behavioral.command.homeautomation;

public class HeatingOffCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingOffCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.heatOff();
    }

}
