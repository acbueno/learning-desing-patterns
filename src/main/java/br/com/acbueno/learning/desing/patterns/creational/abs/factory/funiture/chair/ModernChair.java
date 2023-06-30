package br.com.acbueno.learning.desing.patterns.creational.abs.factory.funiture.chair;

public class ModernChair implements Chair {

    @Override
    public void buildChair() {
      System.out.println("It's a modern chair");
    }

}
