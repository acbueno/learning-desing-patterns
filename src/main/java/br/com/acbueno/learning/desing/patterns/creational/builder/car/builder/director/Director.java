package br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.director;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.Builder;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Engine;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.GPSNavigator;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Transmission;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.TripComputer;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.entity.CarType;

public class Director {

    public void buildSportCar(Builder builder) {
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void buildCityCart(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void buildSUVCar(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(7);
        builder.setEngine(new Engine(4.0, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
