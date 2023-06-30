package br.com.acbueno.learning.desing.patterns.behavioral.observer.news;

public class Client {

    public static void main(String[] args) {
        News subject = new News();
        new EmailNoticationObserver(subject);
        new RssNoticatonObserver(subject);
        subject.setTitle("Palmeiras mantem rontina é campeão novamente.");
        subject.setText("Palmeiras como nós anteriores é campeão brasileiro e da libertadores");
        subject.notification();
    }

}
