package cc.oobootcamp.flyable;

public class Bird {
    protected double x;
    protected double y;
    protected double z;

    public Bird(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void fly() {
        z++;
    }
}
