package br.com.acbueno.learning.desing.patterns.creational.factory.method.factory;

import br.com.acbueno.learning.desing.patterns.creational.factory.method.buttons.Button;
import br.com.acbueno.learning.desing.patterns.creational.factory.method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
