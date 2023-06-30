package br.com.acbueno.learning.desing.patterns.behavioral.mediator.colleague;

import java.util.ArrayList;
import java.util.List;

public class NetWorkMediator implements Mediator {

    List<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        colleagues.add(colleague);

        for (Colleague item : colleagues) {
            if (item != colleague) {
                item.receiveRegisterNotification(colleague);
            }
        }
    }

    public void unRegister(Colleague colleague) {
        colleagues.remove(colleague);

        for (Colleague item : colleagues) {
            if (item != colleague) {
                item.receiveURegisterNotification(colleague);
            }
        }
    }

}
