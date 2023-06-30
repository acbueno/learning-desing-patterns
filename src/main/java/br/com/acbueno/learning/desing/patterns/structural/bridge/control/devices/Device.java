package br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices;

public interface Device {

    boolean isEnable();

    void enanble();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();

}
