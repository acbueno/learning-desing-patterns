package br.com.acbueno.learning.desing.patterns.behavioral.mediator.colleague;

public class ComputerColleague extends Colleague {

    private Mediator mediator;

    public ComputerColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveRegisterNotification(Colleague colleague) {
        System.out.println(String.format("New computer register event with name: %s : recevied @ %s",
                colleague, this));
    }

    @Override
    public void receiveURegisterNotification(Colleague colleague) {
       System.out.println(String.format("Computer left unrigester event with name: %s : recevied @ %s",
               colleague, this));
    }

}
