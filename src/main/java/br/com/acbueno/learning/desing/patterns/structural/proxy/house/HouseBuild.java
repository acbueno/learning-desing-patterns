package br.com.acbueno.learning.desing.patterns.structural.proxy.house;

public class HouseBuild implements Build {

    @Override
    public void build() {
       System.out.println("Building a house");
    }

}
