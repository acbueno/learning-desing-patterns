package br.com.acbueno.learning.desing.patterns.behavioral.observer.converter;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
       System.out.println(String.format("Octal String: %s",
               Integer.toOctalString(subject.getState())));

    }

}
