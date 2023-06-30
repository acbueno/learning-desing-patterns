package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

import java.util.ArrayList;
import java.util.List;

public class Genus implements Taxmonic {

    private String name;
    private List<Taxmonic> listGenus = new ArrayList<>();
    private List<Taxmonic> listFamily = new ArrayList<>();

    public Genus(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDomain(Taxmonic name) {
        // TODO Auto-generated method stub

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
        listFamily.add(name);

    }

    @Override
    public void addGenus(Taxmonic name) {
        listGenus.add(name);
    }

    @Override
    public void addSpecies(Taxmonic name) {
        // TODO Auto-generated method stub

    }

    @Override
    public void print() {
        // TODO Auto-generated method stub

    }

}
