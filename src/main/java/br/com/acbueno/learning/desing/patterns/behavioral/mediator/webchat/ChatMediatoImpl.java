package br.com.acbueno.learning.desing.patterns.behavioral.mediator.webchat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatoImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatoImpl() {
        this.users = new ArrayList<>();
    }


    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMenssage(String msg, User user) {
        for (User item : this.users) {
              if(item!=user) {
                  item.receive(msg);
              }
        }
    }

}
