package br.com.acbueno.learning.desing.patterns.structural.composite.genealogy;

import java.util.ArrayList;
import java.util.List;

public class GrandParent implements Human {

    private String name;
    private String lastName;
    private List<Human> childs = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void print() {
        System.out.println("==============================");
        System.out.println("Name: " + getName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Childs");

        for (Human child : childs) {
            System.out.println("- Name: " + child.getName());
        }
        System.out.println("================================");

    }

    @Override
    public void addChild(Human child) {
        childs.add(child);

    }

    @Override
    public void addParent(Human parent) {

    }

    public GrandParent(String name, String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

}
