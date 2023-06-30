package br.com.acbueno.learning.desing.patterns.behavioral.iterator.squad;

public enum SportType {
    SOCCER(1, "soccer"),
    BASKETBALL(2, "basketball"),
    VOLEIBALL(3, "voleiball"),
    MOTOR_SPORT(4, "motor sport"),
    ALL(5,"multi sport");

    private int code;

    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    private SportType(int code, String description) {
        this.code = code;
        this.description = description;
    }

}
