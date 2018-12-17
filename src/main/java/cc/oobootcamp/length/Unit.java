package cc.oobootcamp.length;

public class Unit {
    public static final Unit CM = new Unit("cm");
    public static final Unit KM = new Unit("km");
    public static final Unit DM = new Unit("dm");
    public static final Unit MM = new Unit("mm");

    private final String symbol;

    private Unit(String symbol) {
        this.symbol = symbol;
    }
}
