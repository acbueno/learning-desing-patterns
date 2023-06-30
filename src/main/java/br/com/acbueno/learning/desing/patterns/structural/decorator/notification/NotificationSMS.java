package br.com.acbueno.learning.desing.patterns.structural.decorator.notification;

public class NotificationSMS extends NotificationDecorator {


    public NotificationSMS(Notification notification) {
       super(notification);
    }

   public void sendNotification() {
          super.sendNotification();
          System.out.print(" Adding notification SMS.");
   }


}
