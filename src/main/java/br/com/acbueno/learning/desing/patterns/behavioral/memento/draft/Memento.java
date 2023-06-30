package br.com.acbueno.learning.desing.patterns.behavioral.memento.draft;

import java.util.Date;

public class Memento {

    private String name;
    private String text;
    private int size;
    private byte[] bytes;
    private Date created;

    public Memento(String name, String text, int size, byte[] bytes, Date created) {
        this.name = name;
        this.text = text;
        this.size = size;
        this.bytes = bytes;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public int getSize() {
        return size;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public Date getCreated() {
        return created;
    }

}
