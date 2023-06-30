package br.com.acbueno.learning.desing.patterns.structural.composite.genealogy;

public class CompositeMain {

    public static void main(String[] args) {
        Child luna = new Child("Luna", "Bueno Barbosa");
        Parent fernanda = new Parent("Fernanda", "Silva Barbosa");
        Parent anderson = new Parent("Anderson Carlos", "Bueno dos Santos");
        luna.addParent(anderson);
        luna.addParent(fernanda);
        fernanda.addChild(luna);
        anderson.addChild(luna);
        GrandParent luiz = new GrandParent("Luiz", "Bertolino dos Santos");
        GrandParent terezinha = new GrandParent("Terezinha", "Bueno Barbosa dos Santos");
        GrandParent marilene = new GrandParent("Mariline", "Silva Barbosa");
        luiz.addChild(anderson);
        anderson.addParent(luiz);
        anderson.addParent(terezinha);
        fernanda.addParent(marilene);
        fernanda.print();
        anderson.print();
        luiz.print();
        luna.print();

    }

}
