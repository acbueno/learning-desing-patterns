package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.app;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair.Chair;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories.FunitureFactory;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.table.Table;

public class Application {

    private Chair chair;
    private Table table;

    public Application(FunitureFactory factory) {
       this.chair = factory.createChair();
       this.table = factory.createTable();
    }

    public void build() {
        chair.buildChair();
        table.buildTable();
    }

}
