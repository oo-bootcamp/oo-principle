package cc.oobootcamp.flyable;

public class Bird {
    private double xIndex;
    private double yIndex;
    private double zIndex;

    public double getHeight() {
        return zIndex;
    }

    public void setHeight(double height) {
        this.zIndex = height;
    }

    public void fly() {
        zIndex++;
    }
}
