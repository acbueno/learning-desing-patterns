package br.com.acbueno.learning.desing.patterns.behavioral.visitor.repair;

public class RepairVisitorImpl implements RepairVisitor {

    @Override
    public int visit(House house) {
        int serviceCost = 0;
        if (house.getTypeRepair().equals("electric")) {
            serviceCost += 200;
        } else if (house.getTypeRepair().equals("hydraulics")) {
            serviceCost += 100;
        } else if (house.getTypeRepair().equals("brickwork")) {
            serviceCost += 500;
        }
        System.out.println(String.format("House repair %s cost: %s", house.getTypeRepair(), serviceCost));
        return serviceCost;
    }

    @Override
    public int visit(Eletronic eletronic) {
        int serviceCost = 0;
        if (eletronic.getType().equals("fan")) {
            serviceCost += 30;
        } else if (eletronic.getType().equals("refigerator")) {
            serviceCost += 500;
        } else {
            serviceCost += 200;
        }
        System.out.println(String.format("Eletronic repair %s  cost: %s", eletronic.getType(), serviceCost));
        return serviceCost;
    }

    @Override
    public int visit(Forniture forniture) {
        int serviceCost = 0;
        if (forniture.getTypeForniture().equals("sofa")) {
            serviceCost += 1000;
        } else {
            serviceCost += 100;
        }
        System.out.println(String.format("Forniture repair %s cost: %s", forniture.getTypeForniture(), serviceCost));
        return serviceCost;
    }

}
