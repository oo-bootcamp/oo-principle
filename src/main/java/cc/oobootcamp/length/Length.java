package cc.oobootcamp.length;

public class Length {
    private final int amount;

    public Length(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    public int compare(Length target) {
        if (amount == target.amount) {
            return 0;
        }
        return amount < target.amount ? -1 : 1;
    }
}
