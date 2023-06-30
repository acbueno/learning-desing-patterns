package br.com.acbueno.learning.desing.patterns.behavioral.mediator.flight;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements Mediator {

    List<Pilot> pilots = new ArrayList<>();

    @Override
    public void openCall(String msg, Pilot pilot) {
        pilots.add(pilot);
        for (Pilot item : pilots) {
            if(pilots.size()==1) {
                item.callControlTower(item, msg);
            } else if (item != pilot) {
                item.callControlTower(item, msg);
            }
        }
    }

    @Override
    public void permissionLand(Pilot pilot, boolean authorization) {
        for (Pilot item : pilots) {
            if(pilots.size()==1) {
                item.callAuthorizationland(pilot, authorization);
            } else if (item !=pilot) {
                item.callAuthorizationland(item, authorization);
            }
        }
    }

}
