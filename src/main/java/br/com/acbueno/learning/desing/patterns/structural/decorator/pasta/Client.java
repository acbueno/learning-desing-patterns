package br.com.acbueno.learning.desing.patterns.structural.decorator.pasta;

public class Client {

    public static void main(String[] args) {
        Pasta pastaBread = new PastaBred(new PastaBasic());
        pastaBread.assemble();
        Pasta pastaCake = new PastaCake(new PastaBasic());
        pastaCake.assemble();
    }

}
