package br.com.acbueno.learning.desing.patterns.behavioral.iterator.squad;

public interface SquadCollection {

    public void addSquad(Squad squad);

    public void removeSquad(Squad squad);

    public SquadInterator iterator(SportType type);

}
