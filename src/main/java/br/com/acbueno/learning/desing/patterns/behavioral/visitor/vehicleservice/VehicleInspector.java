package br.com.acbueno.learning.desing.patterns.behavioral.visitor.vehicleservice;

public interface VehicleInspector {

    int visit(Car car);

    int visit(Van van);

    int visit(Motorcicle motorcicle);

}
