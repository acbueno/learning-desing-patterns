package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair.Chair;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table.Table;

public interface FunitureFactory {

    Chair createChair();

    Table createTable();

}
