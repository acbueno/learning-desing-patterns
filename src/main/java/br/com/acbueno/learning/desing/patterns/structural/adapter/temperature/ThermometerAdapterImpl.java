package br.com.acbueno.learning.desing.patterns.structural.adapter.temperature;

public class ThermometerAdapterImpl extends Thermometer implements ThermometerAdapter {


    @Override
    public Temperature getTemperatureCelisus(Double value) {
        return getTemperature(value);
    }

    @Override
    public Temperature getTemperatureCelisusToKelvin(Double value) {
        return convertCelsiusToKelvin(value);
    }

    @Override
    public Temperature getTemperatureCelsiusToFahrenheit(Double value) {
        return convertCelsiusToFahrenheit(value);
    }

    @Override
    public Temperature getTemperatureKelvinToCelsius(Double value) {
        return convertKelvinToCelsius(value);
    }

    @Override
    public Temperature getTemperatureFahrenheitToCelisus(Double value) {
        return convertFahrenheitToCelsisus(value);
    }

    private Temperature convertCelsiusToFahrenheit(Double value) {
        return new Temperature(value * 1.8 + 32, "Fahrenheit");
    }

    private Temperature convertCelsiusToKelvin(Double value) {
        return new Temperature(value + 273, "Kelvin");
    }

    private Temperature convertKelvinToCelsius(Double value) {
        return new Temperature(value-273, "Celsius");
    }

    private Temperature convertFahrenheitToCelsisus(Double value) {
        return new Temperature((value-32)/1.8, "Celisus");
    }
}
