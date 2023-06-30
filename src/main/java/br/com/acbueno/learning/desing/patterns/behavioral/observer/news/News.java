package br.com.acbueno.learning.desing.patterns.behavioral.observer.news;

import java.util.ArrayList;
import java.util.List;

public class News {

    private List<Observer> observers = new ArrayList<>();
    private String title;
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        //notifyAllObservers();
    }


    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void notification() {
       notifyAllObservers();
    }

}
