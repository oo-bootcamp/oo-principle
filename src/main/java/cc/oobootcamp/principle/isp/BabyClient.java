package cc.oobootcamp.principle.isp;

import java.util.logging.Logger;

public class BabyClient {
    private static final Logger LOGGER = Logger.getLogger(BabyClient.class.getName());

    public static void main(String[] args) {
        HumanAble baby = new Baby();
        baby.cry();
        baby.drink();
        baby.cry();
        baby.eat();
        baby.snore();
        baby.cry();
        baby.drink();
        baby.drink();
        baby.eat();
        baby.crawl();

        long cryTimes = ((Baby) baby).getTimes("CRY");
        long eatTimes = ((Baby) baby).getTimes("EAT");
        long drinkTimes = ((Baby) baby).getTimes("DRINK");
        long snoreTimes = ((Baby) baby).getTimes("SNORE");
        long crawlTimes = ((Baby) baby).getTimes("CRAWL");

        LOGGER.info("Cry " + cryTimes + " times");
        LOGGER.info("Eat " + eatTimes + " times");
        LOGGER.info("Drink " + drinkTimes + " times");
        LOGGER.info("Snore " + snoreTimes + " times");
        LOGGER.info("Crawl " + crawlTimes + " times");
    }
}
