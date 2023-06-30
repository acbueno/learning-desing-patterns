package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class AirConditioningSystemPowerOffCommand implements Command {

    private AirConditioningSystems airConditioningSystems;

    public AirConditioningSystemPowerOffCommand(AirConditioningSystems airConditioningSystems) {
        this.airConditioningSystems = airConditioningSystems;
    }

    @Override
    public void execute() {
        airConditioningSystems.powerOff();
    }

}
