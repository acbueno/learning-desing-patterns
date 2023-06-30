package br.com.acbueno.learning.desing.patterns.structural.bridge.tv;

public class SonyTV implements ITV {

    @Override
    public void on() {
       System.out.println("Sony Tv turned on");
    }

    @Override
    public void off() {
        System.out.println("Sony Tv turned off");
    }

    @Override
    public void switchChannel(int channel) {
       System.out.println("Sony Channel: - " + channel);
    }

}
