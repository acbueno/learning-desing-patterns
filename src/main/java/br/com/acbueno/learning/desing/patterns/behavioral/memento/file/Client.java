package br.com.acbueno.learning.desing.patterns.behavioral.memento.file;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        File file = new File("file1", 500, new Date());
        System.out.println(file);
        FileMemento memento = file.createMemento();
        file.setName("file2");
        System.out.println(file);
        file.restore(memento);
        System.out.println(file);
    }

}
