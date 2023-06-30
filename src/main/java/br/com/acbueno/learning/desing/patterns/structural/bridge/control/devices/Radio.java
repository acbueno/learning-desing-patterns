package br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices;

public class Radio implements Device {

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
    public void setVolume(int volume) {
        if(volume > 100) {
            this.volume = 100;
        } else if(volume < 0) {
            this.volume = 0;
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
        System.out.println("------------------------");
        System.out.println("| Rádio");
        System.out.println("| Rádio está: " + (on ? "ligado" : "desligado"));
        System.out.println("| Volume atual é: " + volume + "%");
        System.out.println("| Estação atual é: " + channel);
        System.out.println("-------------------------\n");
    }

}
