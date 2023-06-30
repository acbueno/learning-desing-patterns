package br.com.acbueno.learning.desing.patterns.behavioral.observer.news;

public class RssNoticatonObserver extends Observer {


    public RssNoticatonObserver(News subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
       String rssNews = "<html><title>News FM</title><body><h1>" + subject.getText()
               +"</h1><h2>"+ subject.getTitle() + "</h2></body></html>";
       System.out.println(rssNews);
    }

}
