package br.com.acbueno.learning.desing.patterns.behavioral.visitor.vehicleservice;

public class Car implements Vehicle {

    private String color;
    private int manufactureDate;

    public Car(String color, int manufactureDate) {
        this.color = color;
        this.manufactureDate = manufactureDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public int accpet(VehicleInspector vehicleInspector) {
        // TODO Auto-generated method stub
        return vehicleInspector.visit(this);
    }

}
