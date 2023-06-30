package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.builder;

import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Massa;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Recheio;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoForno;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoSabor;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.product.Pizza;

public class PizzaBuilder implements Builder {

    private TipoSabor tipoSabor;
    private TipoForno tipoForno;
    private Massa massa;
    private Recheio recheio;

    @Override
    public void setSabor(TipoSabor tipoSabor) {
         this.tipoSabor = tipoSabor;
    }

    @Override
    public void setMassa(Massa massa) {
        this.massa = massa;
    }

    @Override
    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    @Override
    public void setForno(TipoForno tipoForno) {
       this.tipoForno = tipoForno;
    }

    public Pizza getResult() {
        return new Pizza(massa, recheio,
                tipoForno, tipoSabor);
    }

    @Override
    public String toString() {
        return "PizzaBuilder [tipoSabor="
                + tipoSabor + ", tipoForno="
                + tipoForno + ", massa="
                + massa + ", recheio="
                + recheio + "]";
    }

}
