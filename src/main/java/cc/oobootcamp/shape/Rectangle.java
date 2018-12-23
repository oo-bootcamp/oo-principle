package cc.oobootcamp.shape;

public class Rectangle extends Quads{
    protected double width;
    protected double height;

    public void setWidth(double width) { this.width = width; }

    public void setHeight(double height) { this.height = height; }

    public double calculateArea() { return width * height; }
}
