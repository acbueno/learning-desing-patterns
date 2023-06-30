package br.com.acbueno.learning.desing.patterns.structural.bridge.tv;

public class SamsugTV implements ITV {

    @Override
    public void on() {
       System.out.println("Samsung is turned on");

    }

    @Override
    public void off() {
       System.out.println("Samsugn is turned off");

    }

    @Override
    public void switchChannel(int channel) {
       System.out.println("Samsung channel: " + channel);
    }

}
