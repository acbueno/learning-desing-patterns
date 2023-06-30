package br.com.acbueno.learning.desing.patterns.creational.factory.method.factory;

import br.com.acbueno.learning.desing.patterns.creational.factory.method.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();

}
