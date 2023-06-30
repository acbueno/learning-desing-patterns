package br.com.acbueno.learning.desing.patterns.structural.proxy.logistics;

public enum TransportType {
    AIR(1,"Air"),
    NAUTICAL(2, "Nautical"),
    RAIL(3, "Rail"),
    ROAD(4, "Road");

    private int id;

    private String descrpiton;

   TransportType(int id, String descrpiton) {
        this.id = id;
        this.descrpiton = descrpiton;
    }

    public int getId() {
        return id;
    }

    public String getDescrpiton() {
        return descrpiton;
    }

}
