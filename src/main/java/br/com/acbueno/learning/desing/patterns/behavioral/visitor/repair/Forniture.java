package br.com.acbueno.learning.desing.patterns.behavioral.visitor.repair;

public class Forniture implements ItemElement {

    private String typeForniture;
    private String defeactDescription;

    public Forniture(String typeForniture, String defeactDescription) {
        this.typeForniture = typeForniture;
        this.defeactDescription = defeactDescription;
    }

    public String getTypeForniture() {
        return typeForniture;
    }

    public String getDefeactDescription() {
        return defeactDescription;
    }

    @Override
    public int accpet(RepairVisitor visitor) {
        return visitor.visit(this);
    }

}
