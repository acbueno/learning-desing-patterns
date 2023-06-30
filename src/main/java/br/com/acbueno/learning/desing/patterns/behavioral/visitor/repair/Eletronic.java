package br.com.acbueno.learning.desing.patterns.behavioral.visitor.repair;

public class Eletronic implements ItemElement {

    private String brandName;
    private String type;
    private String modelName;
    private String defeactDescription;

    public Eletronic(String brandName, String type, String modelName, String defeactDescription) {
        this.brandName = brandName;
        this.type = type;
        this.modelName = modelName;
        this.defeactDescription = defeactDescription;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getType() {
        return type;
    }

    public String getModelName() {
        return modelName;
    }


    public String getDefeactDescription() {
        return defeactDescription;
    }

    @Override
    public int accpet(RepairVisitor visitor) {
        return visitor.visit(this);
    }

}
