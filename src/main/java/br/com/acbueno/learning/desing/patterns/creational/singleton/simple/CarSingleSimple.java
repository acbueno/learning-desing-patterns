package br.com.acbueno.learning.desing.patterns.creational.singleton.simple;

public class CarSingleSimple {

    private static CarSingleSimple instance;

    private String modelName;

    public String getModelName() {
        return modelName;
    }

    private CarSingleSimple(String value) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.modelName = value;
    }

    public static CarSingleSimple getInstance(String modelName) {
        if(instance == null) {
            instance = new CarSingleSimple(modelName);
        }
        return instance;
    }

}
