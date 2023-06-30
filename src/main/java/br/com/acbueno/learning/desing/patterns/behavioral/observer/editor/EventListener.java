package br.com.acbueno.learning.desing.patterns.behavioral.observer.editor;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);

}
