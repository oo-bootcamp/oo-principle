package cc.oobootcamp.principle.lsp;

public class Rectangle{
    protected double width;
    protected double height;

    public void setWidth(double width) { this.width = width; }

    public void setHeight(double height) { this.height = height; }

    public double calculateArea() { return width * height; }
}
