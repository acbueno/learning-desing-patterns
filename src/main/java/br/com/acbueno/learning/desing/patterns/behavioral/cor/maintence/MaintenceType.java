package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

public enum MaintenceType {
    BODYWORK(1, "Bodywork"),
    SUSPENSION(2, "Suspension"),
    ELECTRIC(3, "Electric"),
    MECHANICS(4, "Mechanics");

    private int id;

    private String descriptionName;

    private MaintenceType(int id, String descriptionName) {
        this.id = id;
        this.descriptionName = descriptionName;
    }

    public int getId() {
        return id;
    }

    public String getDescriptionName() {
        return descriptionName;
    }

}
