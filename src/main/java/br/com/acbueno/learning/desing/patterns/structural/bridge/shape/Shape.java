package br.com.acbueno.learning.desing.patterns.structural.bridge.shape;

public abstract class Shape {

    protected Color color;

    public Shape(Color  color) {
       this.color = color;
    }

    public abstract String draw();

}
