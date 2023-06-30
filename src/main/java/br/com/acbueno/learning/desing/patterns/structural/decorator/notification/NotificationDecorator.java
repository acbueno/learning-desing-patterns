package br.com.acbueno.learning.desing.patterns.structural.decorator.notification;

public class NotificationDecorator implements Notification {

    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification() {
        this.notification.sendNotification();
    }

}
