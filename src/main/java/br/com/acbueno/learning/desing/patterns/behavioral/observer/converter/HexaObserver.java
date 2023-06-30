package br.com.acbueno.learning.desing.patterns.behavioral.observer.converter;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Hex String: %s",
                Integer.toHexString(subject.getState())));
    }

}
