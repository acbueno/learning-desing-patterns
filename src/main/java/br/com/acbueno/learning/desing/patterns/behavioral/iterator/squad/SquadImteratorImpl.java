package br.com.acbueno.learning.desing.patterns.behavioral.iterator.squad;

import java.util.List;

public class SquadImteratorImpl implements SquadInterator {

    private SportType type;
    private List<Squad> squads;
    private int position;

    public SquadImteratorImpl(SportType type, List<Squad> squadList) {
        this.type = type;
        this.squads = squadList;
    }

    @Override
    public boolean hasNext() {
        while (position < squads.size()) {
            Squad squad = squads.get(position);
            if (squad.getSportType().equals(type)) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Squad next() {
        Squad squad = squads.get(position);
        position++;
        return squad;
    }

}
