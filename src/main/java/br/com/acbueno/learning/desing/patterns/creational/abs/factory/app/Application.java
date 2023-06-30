package br.com.acbueno.learning.desing.patterns.creational.abs.factory.app;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.button.Button;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox.CheckBox;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories.GuiFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }

}
