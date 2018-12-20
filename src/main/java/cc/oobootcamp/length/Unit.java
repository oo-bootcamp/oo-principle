package cc.oobootcamp.length;

public enum Unit {
    CM(1), M(100), KM(100000), DM(10), MM(0.1);

    private double factor;

    Unit(double factor) {
        this.factor = factor;
    }

    public double toMeter() {
        return factor / M.factor;
    }
}
