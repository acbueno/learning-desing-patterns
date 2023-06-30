package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class AirConditionSystemPowerOnCommand implements Command {

    private AirConditioningSystems airConditioningSystems;

    public AirConditionSystemPowerOnCommand(AirConditioningSystems airConditioningSystems) {
        this.airConditioningSystems = airConditioningSystems;
    }

    @Override
    public void execute() {
        airConditioningSystems.powerOn();
    }

}
