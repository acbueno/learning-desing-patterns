package br.com.acbueno.learning.desing.patterns.structural.bridge.shape;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangulo é na cor " + color.paint();
    }

}
