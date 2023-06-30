package br.com.acbueno.learning.desing.patterns.behavioral.observer.editor;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<String, List<EventListener>> listerners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listerners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listerners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listerners.get(eventType);
        users.remove(listener);
    }

    public void notify(String evenType, File file) {
        List<EventListener> users = listerners.get(evenType);

        for (EventListener listener : users) {
            listener.update(evenType, file);
        }
    }

}
