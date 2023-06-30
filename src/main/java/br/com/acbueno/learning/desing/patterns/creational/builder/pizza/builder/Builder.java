package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.builder;

import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Massa;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Recheio;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoForno;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoSabor;

public interface Builder {

    void setSabor(TipoSabor tipoSabor);

    void setMassa(Massa massa);

    void setRecheio(Recheio recheio);

    void setForno(TipoForno tipoForno);
}
