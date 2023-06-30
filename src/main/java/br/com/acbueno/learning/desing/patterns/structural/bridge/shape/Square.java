package br.com.acbueno.learning.desing.patterns.structural.bridge.shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Quadrado na " + color.paint();
    }

}
