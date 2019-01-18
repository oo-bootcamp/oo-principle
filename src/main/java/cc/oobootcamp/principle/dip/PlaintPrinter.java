package cc.oobootcamp.principle.dip;

import java.util.List;
import java.util.logging.Logger;

public class PlaintPrinter {
    private static final Logger LOGGER = Logger.getLogger(OrderReceiptHandler.class.getName());

    public void print(List<Item> items, double totalPrice) {
        StringBuilder result = new StringBuilder();

        result.append("----------Order Detail---------\n");
        for (Item item : items) {
            result.append(item.getName()).append("::").append(item.getPrice()).append("\n");
        }
        result.append("Total Price is ").append(totalPrice);

        LOGGER.info(result.toString());
    }
}
