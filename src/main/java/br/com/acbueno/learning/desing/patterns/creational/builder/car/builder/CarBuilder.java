package br.com.acbueno.learning.desing.patterns.creational.builder.car.builder;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Engine;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.GPSNavigator;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Transmission;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.TripComputer;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.entity.CarType;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.product.Car;

public class CarBuilder implements Builder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType cartType) {
       this.carType = cartType;
    }

    @Override
    public void setSeats(int seats) {
       this.seats = seats;

    }

    @Override
    public void setEngine(Engine engine) {
       this.engine = engine;

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(carType, seats,
                engine, transmission,
                tripComputer, gpsNavigator);
    }

}
