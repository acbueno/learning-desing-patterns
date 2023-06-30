package br.com.acbueno.learning.desing.patterns.creational.factory.method.buttons;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();

    }

    @Override
    public void onClick() {
        System.out.println("Click Button says - \"Hello World!\"");
    }

}
