package br.com.acbueno.learning.desing.patterns.behavioral.command.radio;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
       this.light = light;
    }

    @Override
    public void execute() {
       light.off();
    }

}
