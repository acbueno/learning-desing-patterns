package br.com.acbueno.learning.desing.patterns.behavioral.visitor.book;

public class Book implements ItemElement {

    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        super();
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
