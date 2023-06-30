package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair.Chair;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair.ModernChair;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table.ModernTable;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table.Table;

public class ModernFunitureFactory implements FunitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

}
