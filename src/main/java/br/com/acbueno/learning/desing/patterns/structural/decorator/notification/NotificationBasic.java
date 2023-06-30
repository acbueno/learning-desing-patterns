package br.com.acbueno.learning.desing.patterns.structural.decorator.notification;

public class NotificationBasic implements Notification {

    @Override
    public void sendNotification() {
        System.out.print("Mount notification ");

    }

}
