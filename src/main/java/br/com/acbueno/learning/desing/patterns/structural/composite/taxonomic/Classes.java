package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

import java.util.ArrayList;
import java.util.List;

public class Classes implements Taxmonic {

    private String name;
    private List<Taxmonic> listClasses = new ArrayList<>();
    private List<Taxmonic> listPhylums = new ArrayList<>();

    public Classes(String name) {
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
        listPhylums.add(name);

    }

    @Override
    public void addClass(Taxmonic name) {
       listClasses.add(name);

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
        System.out.println("Phylum: " + listPhylums.get(0).getName());

    }



}
