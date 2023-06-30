package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

public class Aircraft {

    private String prefix;

    private String company;

    private Flight flight;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Aircraft [prefix=" + prefix + ", company=" + company + ", route=" + flight + "]";
    }

}
