package br.com.acbueno.learning.desing.patterns.behavioral.mediator.colleague;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new NetWorkMediator();
        ComputerColleague colleague1 = new ComputerColleague(mediator, "Eagle");
        ComputerColleague colleague2 = new ComputerColleague(mediator, "Rabbit");
        ComputerColleague colleague3 = new ComputerColleague(mediator, "Fox");
        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);
        mediator.unRegister(colleague3);
    }

}
