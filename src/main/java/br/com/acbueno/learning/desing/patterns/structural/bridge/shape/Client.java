package br.com.acbueno.learning.desing.patterns.structural.bridge.shape;

public class Client {

    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square.draw());
        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());
    }

}
