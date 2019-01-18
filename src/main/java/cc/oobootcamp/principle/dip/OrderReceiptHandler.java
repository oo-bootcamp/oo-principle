package cc.oobootcamp.principle.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OrderReceiptHandler {
    private static final Logger LOGGER = Logger.getLogger(OrderReceiptHandler.class.getName());

    private List<Item> items = new ArrayList<>();

    public OrderReceiptHandler(List<Item> items) {
        this.items.addAll(items);
    }

    public void printReceipt() {
        StringBuilder result = new StringBuilder();

        result.append("----------Order Detail---------\n");
        for (Item item : items) {
            result.append(item.getName()).append("::").append(item.getPrice()).append("\n");
        }
        result.append("Total Price is ").append(calculateTotalPrice());

        LOGGER.info(result.toString());
    }

    private double calculateTotalPrice() {
        double result = 0;
        for (Item item : items) {
            result = result + item.getPrice();
        }
        return result;
    }
}
