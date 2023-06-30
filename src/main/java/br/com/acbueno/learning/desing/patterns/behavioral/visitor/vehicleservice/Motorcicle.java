package br.com.acbueno.learning.desing.patterns.behavioral.visitor.vehicleservice;

public class Motorcicle implements Vehicle {

    private int engineCapacity;
    private String brand;

    public Motorcicle(int engineCapacity, String brand) {
        this.engineCapacity = engineCapacity;
        this.brand = brand;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int accpet(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }

}
