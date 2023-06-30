package br.com.acbueno.learning.desing.patterns.behavioral.visitor.vehicleservice;

public class VehicleInspection implements VehicleInspector {

    @Override
    public int visit(Car car) {
        int serviceCharge = 0;
        if(car.getColor().equals("Black")) {
            serviceCharge+=100;
        } else {
            serviceCharge+=50;
        }
        System.out.println(String.format("Service Charge for Car:%s", serviceCharge));
        return serviceCharge;
    }

    @Override
    public int visit(Van van) {
        int serviceCharge = 0;
        if(van.getNumberOfDoors()>4) {
            serviceCharge+=500;
        } else {
            serviceCharge+=100;
        }
        System.out.println(String.format("Service Charge for Van: %s", serviceCharge));
        return serviceCharge;
    }

    @Override
    public int visit(Motorcicle motorcicle) {
        int serviceCharge = 0;
        if(motorcicle.getEngineCapacity()>200) {
            serviceCharge += 200;
        } else {
            serviceCharge +=50;
        }
        System.out.println(String.format("Service Charge for Motorbike:%s", serviceCharge));
        return serviceCharge;
    }

}
