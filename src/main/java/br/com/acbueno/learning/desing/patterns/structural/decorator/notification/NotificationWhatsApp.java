package br.com.acbueno.learning.desing.patterns.structural.decorator.notification;

public class NotificationWhatsApp extends NotificationDecorator {

    public NotificationWhatsApp(Notification notification) {
        super(notification);
    }

    public void sendNotification() {
        super.sendNotification();
        System.out.print(" Adding Notification WhatsApp.");
    }

}
