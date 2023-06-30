package br.com.acbueno.learning.desing.patterns.behavioral.iterator.squad;

public class Client {

    public static void main(String[] args) {
        SquadCollection squads = populateSquad();
        SquadInterator baseIterator = squads.iterator(SportType.BASKETBALL);

        while (baseIterator.hasNext()) {
           Squad sq = baseIterator.next();
            System.out.println(sq.toString());
        }

        System.out.println("****************");
        SquadInterator soccerIterator = squads.iterator(SportType.SOCCER);

        while (soccerIterator.hasNext()) {
           Squad sq = soccerIterator.next();
           System.out.println(sq.toString());
        }

        SquadInterator motorSportInterator = squads.iterator(SportType.MOTOR_SPORT);

        while (motorSportInterator.hasNext()) {
           Squad sq = motorSportInterator.next();
           System.out.println(sq.toString());
        }

    }

    private static SquadCollection populateSquad() {
        SquadCollection squadCollection = new SquadCollectionImpl();
        squadCollection.addSquad(new Squad("Palmeiras", SportType.SOCCER));
        squadCollection.addSquad(new Squad("Lakers", SportType.BASKETBALL));
        squadCollection.addSquad(new Squad("Campinas", SportType.VOLEIBALL));
        squadCollection.addSquad(new Squad("Celtics", SportType.BASKETBALL));
        squadCollection.addSquad(new Squad("Mercedes AMG F1", SportType.MOTOR_SPORT));
        squadCollection.addSquad(new Squad("Aston Martin F1", SportType.MOTOR_SPORT));
        squadCollection.addSquad(new Squad("Scuderia Ferrari F1", SportType.MOTOR_SPORT));

        return squadCollection;
    }

}
