package br.com.acbueno.learning.desing.patterns.creational.singleton.multi.thread;

public class CarSingleton {

    private static volatile CarSingleton instance;

    private String carModel;

    private CarSingleton(String carModel){
        this.carModel = carModel;
    }

    public static CarSingleton getInstance(String carModel) {
        CarSingleton result = instance;

        if(result !=null) {
            return result;
        }
        synchronized(CarSingleton.class) {
            if(instance == null) {
                instance = new CarSingleton(carModel);
            }
            return instance;
        }
    }

    public String getCarModel() {
        return carModel;
    }

}
