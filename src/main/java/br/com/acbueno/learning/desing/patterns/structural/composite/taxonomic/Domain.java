package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

import java.util.ArrayList;
import java.util.List;

public class Domain implements Taxmonic {

    private String name;
    private List<Taxmonic> listDomain = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    public Domain(String name) {
        this.name = name;
    }

    @Override
    public void addDomain(Taxmonic name) {
        listDomain.add(name);

    }

    @Override
    public void addKingdom(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addPhylum(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addClass(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addOrder(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addFamily(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addGenus(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void addSpecies(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void print() {
        System.out.println("Domain: " + getName());
    }

}
