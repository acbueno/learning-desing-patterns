package br.com.acbueno.learning.desing.patterns.behavioral.visitor.vehicleservice;

public class Van implements Vehicle {

    private int storeCapacity;
    private int numberOfDoors;

    public Van(int storeCapacity, int numberOfDoors) {
        this.storeCapacity = storeCapacity;
        this.numberOfDoors = numberOfDoors;
    }

    public int getStoreCapacity() {
        return storeCapacity;
    }

    public void setStoreCapacity(int storeCapacity) {
        this.storeCapacity = storeCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public int accpet(VehicleInspector vehicleInspector) {
        return vehicleInspector.visit(this);
    }

}
