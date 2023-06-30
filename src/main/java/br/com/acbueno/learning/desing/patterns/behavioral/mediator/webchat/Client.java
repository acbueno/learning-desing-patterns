package br.com.acbueno.learning.desing.patterns.behavioral.mediator.webchat;

public class Client {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatoImpl();
        User user1 = new UserImpl(mediator, "Rambo");
        User user2 = new UserImpl(mediator, "Rocky");
        User user3 = new UserImpl(mediator, "Ryo");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Ola Todos");

    }

}
