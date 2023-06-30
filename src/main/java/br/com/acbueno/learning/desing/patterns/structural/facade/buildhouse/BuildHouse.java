package br.com.acbueno.learning.desing.patterns.structural.facade.buildhouse;

public class BuildHouse {

    public static void main(String[] args) {
        BuildHouseFacade facade = new BuildHouseFacade();
        facade.build();
    }

}
