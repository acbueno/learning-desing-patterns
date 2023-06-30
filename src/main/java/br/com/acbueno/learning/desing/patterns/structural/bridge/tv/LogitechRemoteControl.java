package br.com.acbueno.learning.desing.patterns.structural.bridge.tv;

public class LogitechRemoteControl extends RemoteControl {

    public LogitechRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard(int channel) {
       setChannel(channel);
       System.out.println("Logitech use keyword to set channel.");
    }

}
