package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table;

public class ClassicTable implements Table {

    @Override
    public void buildTable() {
      System.out.println("It's a classic table");
    }

}
