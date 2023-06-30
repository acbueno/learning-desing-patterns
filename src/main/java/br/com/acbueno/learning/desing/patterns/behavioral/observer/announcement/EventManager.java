package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<String, List<EventListerner>> listernes = new HashMap<>();

    public EventManager(String... operations) {
        for (String operatio : operations) {
            this.listernes.put(operatio, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListerner listerner) {
        List<EventListerner> adverts = listernes.get(eventType);
        adverts.add(listerner);
    }

    public void unsubcribe(String eventType, EventListerner listerner) {
        List<EventListerner> adverts = listernes.get(listerner);
        adverts.remove(listerner);
    }

    public void notify(String evenType, ProductAnnouncement productAnnouncement) {
        List<EventListerner> adverts = listernes.get(evenType);

        for (EventListerner listener : adverts) {
            listener.update(evenType, productAnnouncement);
        }
    }

}
