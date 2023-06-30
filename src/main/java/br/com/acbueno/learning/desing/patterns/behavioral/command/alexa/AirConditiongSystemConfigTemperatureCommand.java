package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class AirConditiongSystemConfigTemperatureCommand implements Command {

    private AirConditioningSystems airConditioningSystems;

    public AirConditiongSystemConfigTemperatureCommand(AirConditioningSystems airConditioningSystems) {
        this.airConditioningSystems = airConditioningSystems;
    }

    @Override
    public void execute() {
        airConditioningSystems.setTemperature(22);
    }

}
