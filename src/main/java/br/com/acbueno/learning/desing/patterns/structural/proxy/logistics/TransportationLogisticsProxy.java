package br.com.acbueno.learning.desing.patterns.structural.proxy.logistics;

public class TransportationLogisticsProxy implements TransportationLogistics {

    private TransportationLogistics transportationLogistics;
    private TransportType transportType;


    public TransportationLogisticsProxy(TransportType transportType) {
        this.transportType = transportType;
    }


    @Override
    public void trasnport() {
        switch (transportType) {
        case AIR:
            transportationLogistics = new AirTransport();
            break;
        case NAUTICAL:
            transportationLogistics = new NauticalTransport();
            break;
        case RAIL:
            transportationLogistics = new RailTransport();
            break;
        case ROAD:
            transportationLogistics = new RoadTransport();
            break;
        }
        transportationLogistics.trasnport();
    }

}
