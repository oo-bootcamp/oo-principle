package cc.oobootcamp.principle.lsp;

import java.util.logging.Logger;

public class Client {
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {
        Rectangle quads = new Rectangle();
        quads.setHeight(3);
        quads.setWidth(5);

        LOGGER.info(String.valueOf(quads.calculateArea()));
    }
}
