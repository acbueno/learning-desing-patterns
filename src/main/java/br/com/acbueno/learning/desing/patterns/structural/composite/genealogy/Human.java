package br.com.acbueno.learning.desing.patterns.structural.composite.genealogy;

public interface Human {

    String getName();

    String getLastName();

    void print();

    void addChild(Human child);

    void addParent(Human parent);

}
