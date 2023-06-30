package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair.Chair;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair.ClassicChair;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table.ClassicTable;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table.Table;

public class ClassicFunitureFacotry implements FunitureFactory {

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }

}
