package cc.oobootcamp.shape;

public class Rectangle extends Quads {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

}
