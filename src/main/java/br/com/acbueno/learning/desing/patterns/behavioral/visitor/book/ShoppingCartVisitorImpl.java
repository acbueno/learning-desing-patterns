package br.com.acbueno.learning.desing.patterns.behavioral.visitor.book;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost=0;
        if(book.getPrice() > 50) {
            cost = book.getPrice() -5;
        } else {
            cost = book.getPrice();
        }
        System.out.println(String.format("Book ISBN: %s cost: %s", book.getIsbnNumber(), cost));
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(String.format("%s cost = %s", fruit.getName(), cost));
        return cost;
    }

}
