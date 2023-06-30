package br.com.acbueno.learning.desing.patterns.structural.bridge.tv;

public class Client {

    public static void main(String[] args) {
        ITV tv = new SamsugTV();
        LogitechRemoteControl lgr = new LogitechRemoteControl(tv);
        lgr.setChannel(50);
    }

}
