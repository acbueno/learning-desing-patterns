package br.com.acbueno.learning.desing.patterns.structural.bridge.tv;

public abstract class RemoteControl {

    private ITV tv;

    public RemoteControl(ITV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.on();
    }

    public void turnOff() {
        tv.off();
    }

    public void setChannel(int channel) {
        tv.switchChannel(channel);
    }

}
