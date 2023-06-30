package br.com.acbueno.learning.desing.patterns.creational.builder.car.builder;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Engine;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.GPSNavigator;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.Transmission;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.components.TripComputer;
import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.entity.CarType;

public interface Builder {

    void setCarType(CarType cartType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);






}
