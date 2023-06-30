package br.com.acbueno.learning.desing.patterns.behavioral.visitor.cumputer;

public class Client {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
