package cc.oobootcamp.length;

public class Length implements Comparable<Length> {
    private final int amount;
    private Unit unit;

    public Length(int amount, Unit unit) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.unit = unit;
        this.amount = amount;
    }

    public int compareTo(Length target) {
        double targetLength = target.unit.rateByTarget(this.unit) * target.amount;
        if (amount == targetLength) {
            return 0;
        }
        return amount < targetLength ? -1 : 1;
    }
}
