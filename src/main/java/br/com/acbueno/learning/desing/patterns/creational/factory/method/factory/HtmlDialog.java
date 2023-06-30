package br.com.acbueno.learning.desing.patterns.creational.factory.method.factory;

import br.com.acbueno.learning.desing.patterns.creational.factory.method.buttons.Button;
import br.com.acbueno.learning.desing.patterns.creational.factory.method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton() ;
    }

}
