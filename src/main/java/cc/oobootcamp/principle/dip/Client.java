package cc.oobootcamp.principle.dip;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("iPhone XS", 7499.0));
        items.add(new Item("iPhone XM MAX", 8599.0));

        OrderReceiptHandler orderReceiptHandler = new OrderReceiptHandler(items);

        orderReceiptHandler.printReceipt();
    }
}
