package br.com.acbueno.learning.desing.patterns.structural.adapter.volt;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }

}
