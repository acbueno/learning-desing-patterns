package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

import javax.security.auth.PrivateCredentialPermission;

public class Announcement {

    public EventManager events;
    private ProductAnnouncement productAnnouncement;

    public Announcement() {
        this.events = new EventManager("created", "update");
    }

    public void created(ProductAnnouncement productAnnouncement) {
        this.productAnnouncement = productAnnouncement;
        events.notify("created", productAnnouncement);
    }

    public void update(ProductAnnouncement product) {
        if(this.productAnnouncement!=null) {
            productAnnouncement.setName(product.getName());
            productAnnouncement.setPrice(product.getPrice());
            productAnnouncement.setProductType(product.getProductType());
        }
        events.notify("update", productAnnouncement);
    }

}
