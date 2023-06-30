package br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices;

public class TV implements Device {

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enanble() {
        on = true;
    }

    @Override
    public void disable() {
       on = false;

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
       if(volume > 100) {
           this.volume = 100;
       } else if(volume < 0) {
           this.volume=0;
       } else {
           this.volume = volume;
       }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("-----------------");
        System.out.println("| TV");
        System.out.println("Está " + (on ? "ligada" : "desligada"));
        System.out.println("Volume atual é: " + volume + "%");
        System.out.println("Canal é: " + channel);
        System.out.println("--------------------\n");
    }

}
