package br.com.acbueno.learning.desing.patterns.structural.proxy.image;

public class Client {

    public static void main(String[] args) {
        Image image  = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("============================");
        image.display();
    }

}
