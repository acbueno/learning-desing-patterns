package br.com.acbueno.learning.desing.patterns.structural.adapter.temperature;

public class Temperature {

    private Double value;

    private String measure;

    public Temperature(Double value, String measure) {
        this.value = value;
        this.measure = measure;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

}
