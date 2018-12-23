package cc.oobootcamp.shape;

public abstract class Quads {
    protected double width;
    protected double height;

    public abstract void setWidth(double width);

    public abstract void setHeight(double width);

    public double calculateArea() { return width * height; }
}
