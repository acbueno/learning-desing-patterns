package br.com.acbueno.learning.desing.patterns.behavioral.mediator.webchat;

public interface ChatMediator {

    public void sendMenssage(String msg, User user);

    public void addUser(User user);

}
