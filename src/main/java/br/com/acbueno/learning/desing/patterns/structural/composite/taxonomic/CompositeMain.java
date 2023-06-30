package br.com.acbueno.learning.desing.patterns.structural.composite.taxonomic;

public class CompositeMain {

    public static void main(String[] args) {
        Taxmonic domain = new Domain("Eukarya");
        Taxmonic kingdom = new Kingdom("Animalia");
        Taxmonic phylum = new Phylum("Chordata");
        Taxmonic classes = new Classes("Mammalia");
        Taxmonic order = new Order("Carnivora");
        Taxmonic family = new Family("Canidae");
        Taxmonic genus = new Genus("Vulpes");
        Taxmonic species = new Species("Vulpes vulpes");
        species.addDomain(domain);
        species.addKingdom(kingdom);
        species.addPhylum(phylum);
        species.addClass(classes);
        species.addOrder(order);
        species.addFamily(family);
        species.addGenus(genus);
        species.print();
    }

}
