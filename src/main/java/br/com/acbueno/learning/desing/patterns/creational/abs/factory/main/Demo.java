package br.com.acbueno.learning.desing.patterns.creational.abs.factory.main;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.app.Application;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories.GuiFactory;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories.MacOsFactory;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories.WindowsFactory;

public class Demo {



    private static Application configureApplication() {
        Application app;
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if(osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}
