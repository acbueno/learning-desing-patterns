package br.com.acbueno.learning.desing.patterns.behavioral.memento.draft;

import java.util.Date;

public class Draft {

    private String name;
    private String text;
    private int size;
    private byte[] bytes;
    private Date created;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Memento saveStateToMomento() {
        return new Memento(name, text, size, bytes, created);
    }

    public void getStateFromMemento(Memento memento) {
        this.name = memento.getName();
        this.bytes = memento.getBytes();
        this.size = memento.getSize();
        this.text = memento.getText();
    }

}
