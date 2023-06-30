package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class AirConditioningSystems {

    public void powerOn() {
        System.out.println("Air-conditioning Systems power on");
    }

    public void powerOff() {
        System.out.println("Air-conditioning Systems power off");
    }

    public void setTemperature(int value) {
        System.out.println(String.format("set temperature: %s", value));
    }

}
