package br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.product;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Engine;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.GPSNavigator;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Transmission;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.TripComputer;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.entity.CarType;

public class Manual {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats,
            Engine engine, Transmission transmission,
            TripComputer tripComputer
            ,GPSNavigator gpsNavigator) {

        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo de Carro:" + carType + "\n";
        info += "Número de bancos:" + seats + "\n";
        info += "Motor: volume - " + engine.getVolume() + "\n";
        info += "Tramissão: " + transmission + "\n";

        if(this.tripComputer != null) {
            info +="Computador de bordo habilitado";
        } else {
            info +="Computador de bord desabilitado";
        }

        return info;
    }



}
