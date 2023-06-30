package br.com.acbueno.learning.desing.patterns.behavioral.iterator.squad;

public class Squad {

    private String name;
    private SportType sportType;

    public Squad(String name, SportType sportType) {
        this.name = name;
        this.sportType = sportType;
    }

    public String getName() {
        return name;
    }

    public SportType getSportType() {
        return sportType;
    }


    @Override
    public String toString() {
        return "Squad [name=" + name + ", sportType=" + sportType + "]";
    }

}
