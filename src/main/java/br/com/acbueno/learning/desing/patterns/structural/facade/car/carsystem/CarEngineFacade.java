package br.com.acbueno.learning.desing.patterns.structural.facade.car.carsystem;

public class CarEngineFacade {

    private static final Integer DEFAULT_COOLING_TEMP = 90;
    private static final Integer MAX_ALLOWED_TEMP = 50;
    private FuelInjection fuelInjection = new FuelInjection();
    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();
    private CatalyticConverter catalyticConverter = new CatalyticConverter();
    private Starter starter = new Starter();

    public void startEngine() {
        fuelInjection.on();
        airFlowController.takeAir();
        fuelInjection.inject();
        starter.start();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        catalyticConverter.on();
    }

    public void stopEngine() {
        fuelInjection.off();
        catalyticConverter.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.stop();
        airFlowController.off();
    }

}
