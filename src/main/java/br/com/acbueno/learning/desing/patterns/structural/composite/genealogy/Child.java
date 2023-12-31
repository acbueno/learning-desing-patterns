package br.com.acbueno.learning.desing.patterns.structural.composite.genealogy;

import java.util.ArrayList;
import java.util.List;

public class Child implements Human {

    private String name;
    private String lastName;
    private List<Human> parents = new ArrayList<Human>();


    public Child(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

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
        System.out.println("==========================");
        System.out.println("Name: " + getName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Parents: ");

        for (Human parent : parents) {
            System.out.println(" - Name: " + parent.getName());
        }
        System.out.println("===========================");
    }

    @Override
    public void addChild(Human child) {
    }

    @Override
    public void addParent(Human parent) {
        parents.add(parent);
    }

}
