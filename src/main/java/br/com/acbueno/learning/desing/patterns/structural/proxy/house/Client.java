package br.com.acbueno.learning.desing.patterns.structural.proxy.house;

public class Client {

    public static void main(String[] args) {
        Build buildHouse = new ProxyBuild("HOUSE");
        buildHouse.build();
        
        Build buildAparment = new ProxyBuild("Ap");
        buildAparment.build();
    }

}
