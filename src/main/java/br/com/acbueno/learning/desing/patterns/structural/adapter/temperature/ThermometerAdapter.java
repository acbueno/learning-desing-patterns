package br.com.acbueno.learning.desing.patterns.structural.adapter.temperature;

public interface ThermometerAdapter {

    Temperature getTemperatureCelisus(Double value);

    Temperature getTemperatureCelisusToKelvin(Double value);

    Temperature getTemperatureCelsiusToFahrenheit(Double value);

    Temperature getTemperatureKelvinToCelsius(Double value);

    Temperature getTemperatureFahrenheitToCelisus(Double value);

}
