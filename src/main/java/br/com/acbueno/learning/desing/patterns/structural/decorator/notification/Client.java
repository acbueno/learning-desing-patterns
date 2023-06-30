package br.com.acbueno.learning.desing.patterns.structural.decorator.notification;

public class Client {

    public static void main(String[] args) {
        Notification notifactionEmail = new NotificationEmail(new NotificationBasic());
        notifactionEmail.sendNotification();
        System.out.println("\n******");
        Notification notificationEmailWhatsSms = new NotificationEmail(new NotificationWhatsApp(new NotificationEmail(new NotificationBasic())));
        notificationEmailWhatsSms.sendNotification();

    }

}
