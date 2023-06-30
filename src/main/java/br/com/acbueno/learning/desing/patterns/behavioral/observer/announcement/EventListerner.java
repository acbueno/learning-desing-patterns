package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

public interface EventListerner {

    void update(String eventType, ProductAnnouncement announcement);

}
