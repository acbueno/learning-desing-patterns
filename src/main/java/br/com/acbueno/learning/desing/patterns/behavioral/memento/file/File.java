package br.com.acbueno.learning.desing.patterns.behavioral.memento.file;

import java.util.Date;

public class File {

    private String name;
    private int size;
    private Date created;

    public File(String name, int size, Date created) {
        this.name = name;
        this.size = size;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public FileMemento createMemento() {
        return new FileMemento(name, size, created);
    }

    public void restore(FileMemento memento) {
        this.name = memento.getName();
        this.size = memento.getSize();
        this.created = memento.getCreated();
    }

    @Override
    public String toString() {
        return "File [name=" + name + ", size=" + size + ", created=" + created + "]";
    }

}
