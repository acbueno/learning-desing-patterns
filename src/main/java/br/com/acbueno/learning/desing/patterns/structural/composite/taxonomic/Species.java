package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

import java.util.ArrayList;
import java.util.List;

public class Species implements Taxmonic {


    private String name;
    private List<Taxmonic> listSpecies = new ArrayList<>();
    private List<Taxmonic> listGenus = new ArrayList<>();
    private List<Taxmonic> listDomain = new ArrayList<>();
    private List<Taxmonic> listKignDom = new ArrayList<>();
    private List<Taxmonic> listPylum = new ArrayList<>();
    private List<Taxmonic> listClasses = new ArrayList<>();
    private List<Taxmonic> listFamily = new ArrayList<>();
    private List<Taxmonic> listOrder = new ArrayList<>();


    public Species(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDomain(Taxmonic name) {
       listDomain.add(name);

    }

    @Override
    public void addKingdom(Taxmonic name) {
        listKignDom.add(name);

    }

    @Override
    public void addPhylum(Taxmonic name) {
        listPylum.add(name);
    }

    @Override
    public void addClass(Taxmonic name) {
        listClasses.add(name);

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
        listGenus.add(name);

    }

    @Override
    public void addSpecies(Taxmonic name) {
        listSpecies.add(name);
    }

    @Override
    public void print() {
        System.out.println("1 " + listDomain.get(0).getName());
        System.out.println(" 2 " + listKignDom.get(0).getName());
        System.out.println("  3 " +listPylum.get(0).getName());
        System.out.println("   4 " + listClasses.get(0).getName());
        System.out.println("    5 " +listOrder.get(0).getName());
        System.out.println("     6 " +listFamily.get(0).getName());
        System.out.println("      7 " + listGenus.get(0).getName());
        System.out.println("       8 " + getName());

    }

}
