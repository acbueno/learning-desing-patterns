package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.product;

import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Massa;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Recheio;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoForno;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoSabor;

public class Pizza {

    private final Massa massa;
    private final Recheio recheio;
    private final TipoForno tipoForno;
    private final TipoSabor tipoSabor;

    public Pizza(Massa massa, Recheio recheio,
            TipoForno tipoForno, TipoSabor tipoSabor) {
        this.massa = massa;
        this.recheio = recheio;
        this.tipoForno = tipoForno;
        this.tipoSabor = tipoSabor;
    }

    public Massa getMassa() {
        return massa;
    }

    public Recheio getRecheio() {
        return recheio;
    }

    public TipoForno getTipoForno() {
        return tipoForno;
    }

    public TipoSabor getTipoSabor() {
        return tipoSabor;
    }

}
