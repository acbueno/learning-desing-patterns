package br.com.acbueno.learning.desing.patterns.structural.bridge.control;

import br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices.Device;
import br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices.Radio;
import br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices.TV;
import br.com.acbueno.learning.desing.patterns.structural.bridge.control.remote.AdvancedRemote;
import br.com.acbueno.learning.desing.patterns.structural.bridge.control.remote.BasicRemote;

public class Client {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Test with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
