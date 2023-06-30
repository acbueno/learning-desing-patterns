package br.com.acbueno.learning.desing.patterns.behavioral.memento.caretaker;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoToList = new ArrayList<>();

    public void add(Memento state) {
        mementoToList.add(state);
    }

    public Memento get(int index) {
        return mementoToList.get(index);
    }

}
