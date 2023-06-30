package br.com.acbueno.learning.desing.patterns.behavioral.visitor.book;

public class Client {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {new Book(20, "1234"), new Book(100, "456")
                , new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Laranja")};
        int  total = calculatePrice(items);
        System.out.println(String.format("Total cost = %s", total));
    }

    public static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor vistor = new ShoppingCartVisitorImpl();
        int sum =0;

        for (ItemElement item : items) {
            sum = sum + item.accept(vistor);
        }
        return sum;
    }

}
