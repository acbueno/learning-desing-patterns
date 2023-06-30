package br.com.acbueno.learning.desing.patterns.creational.builder.pizza.director;

import java.util.ArrayList;
import java.util.List;

import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.builder.Builder;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Massa;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.Recheio;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoForno;
import br.com.acbueno.learning.desing.patterns.creational.builder.pizza.componets.TipoSabor;

public class Director {

    public void buildCalabresa(Builder builder) {
        builder.setMassa(Massa.MASSA_GROSSA);
        Recheio recheio = new Recheio();
        //List<Recheio> listRecheio = new ArrayList<>();
        recheio.adcionarIngradientes("Queijo Muçarela");
        recheio.adcionarIngradientes("Calabresa");
        recheio.adcionarIngradientes("Cebola");
        recheio.adcionarIngradientes("Alho");
        recheio.adcionarIngradientes("Oregano");
        recheio.adcionarIngradientes("Pimenta");
        builder.setRecheio(recheio);
        builder.setSabor(TipoSabor.CALABRESA);
        builder.setForno(TipoForno.FORNO_GAS);
    }

    public void buildMuçarela(Builder builder) {
        builder.setMassa(Massa.MASSA_FINA);
        Recheio recheio = new Recheio();
        recheio.adcionarIngradientes("Queijo Muçarela");
        recheio.adcionarIngradientes("Cebola");
        recheio.adcionarIngradientes("Oregano");
        builder.setRecheio(recheio);
        builder.setSabor(TipoSabor.CALABRESA);
        builder.setForno(TipoForno.FORNO_GAS);
    }

}
