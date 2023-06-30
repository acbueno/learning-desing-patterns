package br.com.acbueno.learning.desing.patterns.behavioral.command.radio;

public class LigthOnComand implements Command {

    private Light light;

    public LigthOnComand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
      light.on();
    }

}
