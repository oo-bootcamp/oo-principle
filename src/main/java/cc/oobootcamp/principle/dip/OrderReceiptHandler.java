package cc.oobootcamp.principle.dip;

import java.util.ArrayList;
import java.util.List;

public class OrderReceiptHandler {
    private List<Item> items = new ArrayList<>();

    private PrinterType printerType;

    private PlaintPrinter plaintPrinter = new PlaintPrinter();


    public OrderReceiptHandler(List<Item> items, PrinterType printerType) {
        this.printerType = printerType;
        this.items.addAll(items);
    }

    public void printReceipt() {
        if (printerType == PrinterType.PLAINT) {
            plaintPrinter.print(items, calculateTotalPrice());
        }
    }

    private double calculateTotalPrice() {
        double result = 0;
        for (Item item : items) {
            result = result + item.getPrice();
        }
        return result;
    }
}
