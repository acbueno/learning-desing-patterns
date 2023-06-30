package br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.button.Button;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.button.MacOsButton;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox.CheckBox;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox.MacOSCheckBox;

public class MacOsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }

}
