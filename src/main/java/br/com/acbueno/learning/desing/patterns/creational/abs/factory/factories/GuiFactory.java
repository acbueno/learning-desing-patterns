package br.com.acbueno.learning.desing.patterns.creational.abs.factory.factories;

import br.com.acbueno.learning.desing.patterns.creational.abs.factory.button.Button;
import br.com.acbueno.learning.desing.patterns.creational.abs.factory.checkbox.CheckBox;

public interface GuiFactory {

    Button createButton();

    CheckBox createCheckBox();

}
