package br.com.acbueno.learning.desing.patterns.structural.adapter.volt;

public interface SocketAdapter {

    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();

}
