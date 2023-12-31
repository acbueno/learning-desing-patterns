package br.com.acbueno.learning.desing.patterns.structural.bridge.control.remote;

import br.com.acbueno.learning.desing.patterns.structural.bridge.control.devices.Device;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote() {

    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote power toggle");
        if(device.isEnable()) {
            device.disable();
        } else {
            device.enanble();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote volume down");
        device.setVolume(device.getVolume()-10);
    }

    @Override
    public void channelUp() {
       System.out.println("Remote volume up");
       device.setVolume(device.getVolume()+10);
    }

    @Override
    public void channelDown() {
       System.out.println("Remote channel down");
       device.setChannel(device.getChannel() -1);
    }

    @Override
    public void voluneUp() {
       System.out.println("Remote channel up");
       device.setChannel(device.getChannel() +1);
    }

}
