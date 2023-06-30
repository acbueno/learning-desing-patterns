package br.com.acbueno.learning.desing.patterns.behavioral.iterator.squad;

import java.util.ArrayList;
import java.util.List;

public class SquadCollectionImpl implements SquadCollection {

    private List<Squad> squadList;

    public SquadCollectionImpl() {
       this.squadList = new ArrayList<>();
    }

    @Override
    public void addSquad(Squad squad) {
        this.squadList.add(squad);
    }

    @Override
    public void removeSquad(Squad squad) {
       this.squadList.remove(squad);
    }

    @Override
    public SquadInterator iterator(SportType type) {
        return new SquadImteratorImpl(type, squadList);
    }

}
