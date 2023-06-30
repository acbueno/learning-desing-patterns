package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

import java.util.ArrayList;
import java.util.List;

public class Family implements Taxmonic {

    private String name;
    private List<Taxmonic> listFamily = new ArrayList<>();
    private List<Taxmonic> listOrder = new ArrayList<>();


    public Family(String name) {
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
       listOrder.add(name);

    }

    @Override
    public void addFamily(Taxmonic name) {
        listFamily.add(name);

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
        // TODO Auto-generated method stub

    }

}
