package br.com.acbueno.learning.desing.patterns.structural.proxy.logistics;

public class Client {

    public static void main(String[] args) {

        TransportationLogistics railTransport = new TransportationLogisticsProxy(TransportType.RAIL);
        railTransport.trasnport();

        TransportationLogistics nauticalTransport = new TransportationLogisticsProxy(TransportType.NAUTICAL);
        nauticalTransport.trasnport();

        TransportationLogistics roadTransport = new TransportationLogisticsProxy(TransportType.ROAD);
        roadTransport.trasnport();

        TransportationLogistics airTransport = new TransportationLogisticsProxy(TransportType.AIR);
        airTransport.trasnport();
    }

}
