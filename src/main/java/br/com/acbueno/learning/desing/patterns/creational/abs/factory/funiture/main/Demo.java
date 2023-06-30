package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.main;


import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.app.Application;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories.ClassicFunitureFacotry;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories.FunitureFactory;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.factories.ModernFunitureFactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        FunitureFactory factory;
        String factoryType = "classic";

        if(factoryType.equals("classic")) {
            factory = new ClassicFunitureFacotry();
        } else {
            factory = new ModernFunitureFactory();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.build();
    }

}
