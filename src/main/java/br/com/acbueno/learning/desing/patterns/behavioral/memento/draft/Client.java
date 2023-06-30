package br.com.acbueno.learning.desing.patterns.behavioral.memento.draft;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        Draft draft = new Draft();
        CareTaker careTaker = new CareTaker();
        draft.setName("draft1");
        draft.setText("Bla bla bla bla bla bla");
        draft.setCreated(new Date());
        byte[] byteArray1 = { 80, 65, 78, 75, 65, 74 };
        draft.setBytes(byteArray1);
        draft.setSize(50);
        careTaker.add(draft.saveStateToMomento());
        draft.setName("draft2");
        draft.setText("12312234444444");
        draft.setCreated(new Date());
        byte[] byteArray2 = { 80, 0, 78, 75, 65, 74 };
        draft.setBytes(byteArray2);
        draft.setSize(20);
        draft.setCreated(new Date());
        careTaker.add(draft.saveStateToMomento());
        draft.getStateFromMemento(careTaker.get(0));
        print(draft);
        draft.getStateFromMemento(careTaker.get(1));
        print(draft);
        draft.getStateFromMemento(careTaker.get(0));
        print(draft);
    }

    private static void print(Draft draft) {
        System.out.println(String.format("Current Name %s: ", draft.getName()));
        System.out.println(String.format("Current Text  %s: ", draft.getText()));
        System.out.println(String.format("Current created  %s: ", draft.getCreated()));
        System.out.println(String.format("Current size  %s: ", draft.getSize()));
        System.out.println(String.format("Current byte  %s: ", draft.getBytes()));
    }

}
