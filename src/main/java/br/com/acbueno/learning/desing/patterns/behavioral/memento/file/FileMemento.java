package br.com.acbueno.learning.desing.patterns.behavioral.memento.file;

import java.util.Date;

public final class FileMemento {

    private final String name;
    private final int size;
    private final Date created;

    public FileMemento(String name, int size, Date created) {
        this.name = name;
        this.size = size;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public Date getCreated() {
        return created;
    }

    public int getSize() {
        return size;
    }

}
