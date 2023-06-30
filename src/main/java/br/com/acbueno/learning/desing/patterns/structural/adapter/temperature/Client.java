package br.com.acbueno.learning.desing.patterns.structural.adapter.temperature;

public class Client {

    public static void main(String[] args) {
        testConvertTemperature();
    }

    private static void testConvertTemperature() {
        ThermometerAdapter thermometerAdapter = new ThermometerAdapterImpl();
        Temperature temperatureCelisusFahrenheit = getTemperature(thermometerAdapter, "Celsius", "Fahrenheit", 30);
        Temperature temperatureCelsiusKelvin = getTemperature(thermometerAdapter, "Celsius", "Kelvin", 30);
        Temperature temperatureCelsius = getTemperature(thermometerAdapter, "Celsius", "Celsius", 30);
        Temperature temperatureFahrenheitCelsius = getTemperature(thermometerAdapter, "Fahrenheit", "Celsius", 86);
        Temperature temperatureKelvinCelsius = getTemperature(thermometerAdapter, "Kelvin", "Celsius", 303.0);
        System.out.println(String.format("Convertendo 30 Celsisus para Faahrenheit :%s ", temperatureCelisusFahrenheit.getValue()));
        System.out.println(String.format("Convertendo 30 Celsisus para Kelvin :%s ", temperatureCelsiusKelvin.getValue()));
        System.out.println(String.format("Convertendo 30 Celsisus para Celisus :%s ", temperatureCelsius.getValue()));
        System.out.println(String.format("Convertendo 86 Fahrenheit para Celisus :%s ", temperatureFahrenheitCelsius.getValue()));
        System.out.println(String.format("Convertendo 303 Kelvin para Celisus :%s ", temperatureKelvinCelsius.getValue()));
    }

    private static Temperature getTemperature(ThermometerAdapter convert, String measureOrigin, String measureTo, double value) {
        switch (measureOrigin+measureTo) {
        case "CelsiusKelvin":
          return convert.getTemperatureCelisusToKelvin(value);
        case "CelsiusFahrenheit":
            return convert.getTemperatureCelsiusToFahrenheit(value);
        case "FahrenheitCelsius":
            return convert.getTemperatureFahrenheitToCelisus(value);
        case "KelvinCelsius":
            return convert.getTemperatureKelvinToCelsius(value);
        default:
            return convert.getTemperatureCelisus(value);
        }
    }

}
