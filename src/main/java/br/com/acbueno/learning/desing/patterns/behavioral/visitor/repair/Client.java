package br.com.acbueno.learning.desing.patterns.behavioral.visitor.repair;

public class Client {

    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[] { 
                new Eletronic("Mondial", "Airfray", "AF45", "Not power"), 
                new Forniture("Sofa", "Changing sofa fabric"), 
                new House("brickwork", "build wall"), 
                new Eletronic("Mondial", "refigerator", "AF45", "Not power"), };
        int totalCost = calculateTotal(itemElements);
        System.out.println(String.format("Total Service Charge: %s", totalCost));
    }

    private static int calculateTotal(ItemElement[] itemElements) {
        RepairVisitor visitor = new RepairVisitorImpl();
        int total = 0;

        for (ItemElement item : itemElements) {
            total = total + item.accpet(visitor);
        }

        return total;
    }

}
