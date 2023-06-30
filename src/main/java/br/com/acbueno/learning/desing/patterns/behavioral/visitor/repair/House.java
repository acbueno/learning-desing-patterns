package br.com.acbueno.learning.desing.patterns.behavioral.visitor.repair;

public class House implements ItemElement {

    private String typeRepair;
    private String defeactDescription;

    public House(String typeRepair, String defeactDescription) {
        this.typeRepair = typeRepair;
        this.defeactDescription = defeactDescription;
    }

    public String getTypeRepair() {
        return typeRepair;
    }

    public String getDefeactDescription() {
        return defeactDescription;
    }

    @Override
    public int accpet(RepairVisitor visitor) {
        return visitor.visit(this);
    }

}
