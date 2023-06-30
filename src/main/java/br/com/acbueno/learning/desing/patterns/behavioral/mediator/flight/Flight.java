package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

public class Flight {

    private String airPortOrgim;

    private String airPortFrom;

    private String flightTakeoffTime;

    private String flightArrivalTime;

    private String flighCode;

    public String getAirPortOrgim() {
        return airPortOrgim;
    }

    public void setAirPortOrgim(String airPortOrgim) {
        this.airPortOrgim = airPortOrgim;
    }

    public String getAirPortFrom() {
        return airPortFrom;
    }

    public void setAirPortFrom(String airPortFrom) {
        this.airPortFrom = airPortFrom;
    }

    public String getFlightTakeoffTime() {
        return flightTakeoffTime;
    }

    public void setFlightTakeoffTime(String flightTakeoffTime) {
        this.flightTakeoffTime = flightTakeoffTime;
    }

    public String getFlightArrivalTime() {
        return flightArrivalTime;
    }

    public void setFlightArrivalTime(String flightArrivalTime) {
        this.flightArrivalTime = flightArrivalTime;
    }

    public String getFlighCode() {
        return flighCode;
    }

    public void setFlighCode(String flighCode) {
        this.flighCode = flighCode;
    }

    @Override
    public String toString() {
        return "Route [airPortOrgim=" + airPortOrgim + ", airPortFrom=" + airPortFrom + ", flightTakeoffTime=" + flightTakeoffTime + ", flightArrivalTime=" + flightArrivalTime + ", flighCode=" + flighCode + "]";
    }

}
