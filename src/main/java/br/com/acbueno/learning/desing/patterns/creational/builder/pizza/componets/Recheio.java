package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets;

import java.util.ArrayList;
import java.util.List;

public class Recheio {

    private List<String> listIngradientes = new ArrayList<>();

    public void adcionarIngradientes(String ingradientes) {
        this.listIngradientes.add(ingradientes);
    }

    public List<String> getListIngradientes() {
        return this.listIngradientes;
    }

}
