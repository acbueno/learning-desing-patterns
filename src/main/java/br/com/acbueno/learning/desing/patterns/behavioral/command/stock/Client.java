package br.com.acbueno.learning.desing.patterns.behavioral.command.stock;

public class Client {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStock);
        broker.placeOrders();

    }

}
