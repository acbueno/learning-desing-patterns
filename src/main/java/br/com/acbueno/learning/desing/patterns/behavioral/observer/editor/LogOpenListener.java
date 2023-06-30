package br.com.acbueno.learning.desing.patterns.behavioral.observer.editor;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
       System.out.println(String.format("Save to log %s : "
               + "Someone has performed %s  "
               + "operation with the following file: %s", log, eventType, file.getName()));
    }

}
