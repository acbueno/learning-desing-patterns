package br.com.acbueno.learning.desing.patterns.behavioral.observer.converter;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Binary String: %s",
                Integer.toBinaryString(subject.getState())));
    }

}
