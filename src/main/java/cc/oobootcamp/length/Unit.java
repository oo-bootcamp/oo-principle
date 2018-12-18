package cc.oobootcamp.length;

public class Unit {
    public static final Unit CM = new Unit("cm", 0.01);
    public static final Unit M = new Unit("cm", 1.0);
    public static final Unit KM = new Unit("km", 1000);
    public static final Unit DM = new Unit("dm", 0.1);
    public static final Unit MM = new Unit("mm", 0.001);

    private final String symbol;

    private final double factor;

    private Unit(String symbol, double factor) {
        this.symbol = symbol;
        this.factor = factor;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getFactor() {
        return factor;
    }

    public double toMeter(int amount) {
        return amount * factor;
    }
}
