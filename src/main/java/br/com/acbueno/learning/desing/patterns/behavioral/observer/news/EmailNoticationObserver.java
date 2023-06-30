package br.com.acbueno.learning.desing.patterns.behavioral.observer.news;

import java.util.ArrayList;
import java.util.List;

public class EmailNoticationObserver extends Observer {

    private List<String> email = new ArrayList<>();

    public EmailNoticationObserver(News subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    private void addEmail() {
        email.add("test1@new.com");
        email.add("test2@sbt.com");
        email.add("teste3@globo.com");
    }

    @Override
    public void update() {
        addEmail();
        for (String item : email) {
            System.out.println(String.format("email: %s ,tiltle : %s  ,text: %s", item, subject.getTitle(), subject.getText()));
        }

    }

}
