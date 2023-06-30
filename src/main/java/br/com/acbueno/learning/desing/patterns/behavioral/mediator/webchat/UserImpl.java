package br.com.acbueno.learning.desing.patterns.behavioral.mediator.webchat;

public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(String.format("%s :Sending Message=%s", this.name, msg));
        mediator.sendMenssage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(String.format("%s :Received Message: %s", this.name, msg));
    }

}
