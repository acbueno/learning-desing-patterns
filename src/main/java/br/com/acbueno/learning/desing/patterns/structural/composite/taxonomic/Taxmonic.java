package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

public interface Taxmonic {

    String getName();

    void addDomain(Taxmonic name);

    void addKingdom(Taxmonic name);

    void addPhylum(Taxmonic name);

    void addClass(Taxmonic name);

    void addOrder(Taxmonic name);

    void addFamily(Taxmonic name);

    void addGenus(Taxmonic name);

    void addSpecies(Taxmonic name);

    void print();

}
