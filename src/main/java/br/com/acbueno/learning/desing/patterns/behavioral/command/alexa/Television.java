package br.com.acbueno.learning.desing.patterns.behavioral.command.alexa;

public class Television {

    public void powerOn() {
        System.out.println("TV turn on");
    }

    public void powerOff() {
        System.out.println("Tv turn off");
    }

    public void setVolume(int volume) {
        System.out.println(String.format("Volume : %s", volume));
    }

    public void setChannel(int channel) {
        System.out.println(String.format("Channel : %s", channel));
    }

}
