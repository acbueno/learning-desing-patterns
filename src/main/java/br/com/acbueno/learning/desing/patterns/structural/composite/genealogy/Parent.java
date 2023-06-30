package br.com.acbueno.learning.desing.patterns.structural.composite.genealogy;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Human {

    private String name;
    private String lastName;
    private List<Human> grandParents = new ArrayList<>();
    private List<Human> childs = new ArrayList<>();

    public Parent(String name, String lastName) {
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
        System.out.println("============================");
        System.out.println("Name: " + getName());
        System.out.println("Last Name " + getLastName());
        System.out.println("Parents: ");

        for (Human parent : grandParents) {
            System.out.println(" - Name: " + parent.getName());
        }

        System.out.println("Childs: ");
        for (Human child : childs) {
            System.out.println(" - Name: " + child.getName());
        }
    }

    @Override
    public void addChild(Human child) {
        childs.add(child);

    }

    @Override
    public void addParent(Human parent) {
        grandParents.add(parent);
    }

}
