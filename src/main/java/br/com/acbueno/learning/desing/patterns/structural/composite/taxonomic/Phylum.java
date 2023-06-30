package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

import java.util.ArrayList;
import java.util.List;

public class Phylum implements Taxmonic {


    private String name;
    private List<Taxmonic> listPylum = new ArrayList<>();
    private List<Taxmonic> listKingdom = new ArrayList<>();

    public Phylum(String name) {
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
        listKingdom.add(name);

    }

    @Override
    public void addPhylum(Taxmonic name) {
        listPylum.add(name);

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

    }

}
