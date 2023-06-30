package br.com.acbueno.learning.desing.patterns.behavioral.command.homeautomation;

public class HeatingOnCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingOnCommand(HeatingSystem heatingSystem) {
       this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
       heatingSystem.heatOn();
    }

}
