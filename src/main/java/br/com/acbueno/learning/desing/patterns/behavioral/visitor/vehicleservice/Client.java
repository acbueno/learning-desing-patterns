package br.com.acbueno.learning.desing.patterns.behavioral.visitor.vehicleservice;

public class Client {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
                new Car("Black", 2010),
                new Van(5000, 6),
                new Motorcicle(100, "Honda")
        };

        int totalCost = calculateTotal(vehicles);
        System.out.println(String.format("Total Service Charge: %s", totalCost));

    }

    private static int calculateTotal(Vehicle[] vehicles) {
        VehicleInspector inspector = new VehicleInspection();
        int total =0;
        
        for(Vehicle vehicle:vehicles) {
            total = total+vehicle.accpet(inspector);
        }

        return total;
    }

}
