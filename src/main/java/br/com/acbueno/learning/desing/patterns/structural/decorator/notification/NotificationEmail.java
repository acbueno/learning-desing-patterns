package br.com.acbueno.learning.desing.patterns.structural.decorator.notification;



public class NotificationEmail extends NotificationDecorator {

    public NotificationEmail(Notification notification) {
        super(notification);
    }

    public void sendNotification() {
        super.sendNotification();
        System.out.print(" Adding Notification Email.");
    }

}
