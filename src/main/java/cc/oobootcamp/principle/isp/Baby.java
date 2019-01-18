package cc.oobootcamp.principle.isp;

import java.util.HashMap;
import java.util.Map;

public class Baby implements HumanAble {
    private Map<String, Long> records = new HashMap<>();

    @Override
    public void crawl() {
        increase("CRAWL");
    }

    @Override
    public void eat() {
        increase("EAT");
    }

    @Override
    public void drink() {
        increase("DRINK");
    }

    @Override
    public void cry() {
        increase("CRY");
    }

    @Override
    public void snore() {
        increase("SNORE");
    }

    public long getTimes(String behavior) {
        return records.get(behavior);
    }

    private void increase(String behavior) {
        Long crawlTimes = records.get(behavior);
        if (crawlTimes != null) {
            records.put(behavior, crawlTimes + 1);
            return;
        }
        records.put(behavior, 1L);
    }
}
