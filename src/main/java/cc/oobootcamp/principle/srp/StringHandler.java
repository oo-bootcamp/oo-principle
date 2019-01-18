package cc.oobootcamp.principle.srp;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class StringHandler {

    private static final Logger LOGGER = Logger.getLogger(StringHandler.class.getName());

    private String source;

    private String target;

    public StringHandler(String source) {
        this.source = source;
    }

    public String convert() {
        if (source.matches("\\d{4}-\\d{2}-\\d{2}")) {
            target = source.replaceAll("-", "");
            return target;
        }

        Map<String, Integer> result = new HashMap<>();
        char[] chars = source.toCharArray();
        for (char c : chars) {
            if (result.get(c) != null) {
                result.put(String.valueOf(c), result.get(c) + 1);
            } else {
                result.put(String.valueOf(c), 1);
            }
        }
        target = result.toString();
        return target;
    }

    public void print() {
        LOGGER.info("Source = " + source + "; Target = " + target);
    }
}
