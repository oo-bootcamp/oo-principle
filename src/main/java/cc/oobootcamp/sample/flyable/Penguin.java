package cc.oobootcamp.sample.flyable;

public class Penguin implements Flyable {
    private double positionX;
    private double positionY;

    public Penguin(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public void fly() {
        positionX++;
    }

    @Override
    public double reportX() {
        return positionX;
    }

    @Override
    public double reportY() {
        return positionY;
    }

    @Override
    public double reportZ() {
        return 0;
    }
}
