package cc.oobootcamp.sample.flyable;

public class Bird implements Flyable {
    private double positionX;
    private double positionY;
    private double positionZ;

    public Bird(double positionX, double positionY, double positionZ) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
    }

    public double reportX() {
        return positionX;
    }

    public double reportY() {
        return positionY;
    }

    public double reportZ() {
        return positionZ;
    }

    @Override
    public void fly() {
        positionZ++;
    }
}
