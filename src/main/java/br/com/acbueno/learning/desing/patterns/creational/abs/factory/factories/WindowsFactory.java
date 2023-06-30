package br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.button.Button;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.button.WindowButton;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox.CheckBox;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox.WindowCheckBox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }

}
