package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

public class MercadoLivreListener implements EventListerner {

    private ProductAnnouncement productAnnouncement;

    public MercadoLivreListener(ProductAnnouncement productAnnouncement) {
     this.productAnnouncement = productAnnouncement;
    }

    @Override
    public void update(String eventType, ProductAnnouncement announcement) {
        System.out.println(String.format("Event: %s, product: %s", eventType, productAnnouncement.toString()));
    }

}
