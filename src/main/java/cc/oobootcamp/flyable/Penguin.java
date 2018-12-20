package cc.oobootcamp.flyable;

public class Penguin extends Bird {
    public Penguin(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public void fly() {
        x++;
    }
}
