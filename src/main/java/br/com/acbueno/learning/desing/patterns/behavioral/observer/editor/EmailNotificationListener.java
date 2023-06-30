package br.com.acbueno.learning.desing.patterns.behavioral.observer.editor;

import java.io.File;

public class EmailNotificationListener implements EventListener{

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println(String.format("Email to %s : "
                + "Someone has performed %s "
                + "operation with the following file: %s", email, eventType, file.getName()));
    }

}
