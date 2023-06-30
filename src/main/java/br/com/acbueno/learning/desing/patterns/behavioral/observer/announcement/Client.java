package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

public class Client {

    public static void main(String[] args) {
        Announcement announcement = new Announcement();
        ProductAnnouncement productAnnouncement1 = new ProductAnnouncement();
        productAnnouncement1.setName("Furadeira 3/4 Impact Bosch");
        productAnnouncement1.setPrice(250.00);
        productAnnouncement1.setProductType(ProductType.ELECTRONICS);
        announcement.events.subscribe("created", new MercadoLivreListener(productAnnouncement1));
        announcement.events.subscribe("update", new MercadoLivreListener(productAnnouncement1));
        announcement.created(productAnnouncement1);
        productAnnouncement1.setName("Furadeira GSR Bosch");
        productAnnouncement1.setPrice(260.00);
        productAnnouncement1.setProductType(ProductType.ELECTRONICS);
        announcement.update(productAnnouncement1);
        ProductAnnouncement productAnnouncement2 = new ProductAnnouncement();
        productAnnouncement2.setName("Toyota Corrola");
        productAnnouncement2.setPrice(160.00);
        productAnnouncement2.setProductType(ProductType.CAR);
        announcement.events.subscribe("created", new WebMotorsListener(productAnnouncement2));
        announcement.created(productAnnouncement2);
    }

}
