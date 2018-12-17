package cc.oobootcamp.length;

public class Length {
    private final int amount;
    private String unit;

    public Length(int amount, String unit) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.unit = unit;
        this.amount = amount;
    }

    public int compare(Length target) {
        if (!unit.contentEquals(target.unit)) {
            throw new IllegalStateException();
        }
        if (amount == target.amount) {
            return 0;
        }
        return amount < target.amount ? -1 : 1;
    }
}
