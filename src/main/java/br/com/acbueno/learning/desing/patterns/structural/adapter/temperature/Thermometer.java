package br.com.acbueno.learning.desing.patterns.structural.adapter.temperature;

public class Thermometer {

    public Temperature getTemperature(Double value) {
        return new Temperature(value, "Celsius");
    }

}
