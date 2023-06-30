package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

public class WebMotorsListener implements EventListerner {

    private ProductAnnouncement productAnnouncement;

    public WebMotorsListener(ProductAnnouncement productAnnouncement) {
       this.productAnnouncement = productAnnouncement;
    }

    @Override
    public void update(String eventType, ProductAnnouncement announcement) {
       System.out.println(String.format("Event: %s, product: %s", eventType, productAnnouncement.toString()));
    }

}
