package cc.oobootcamp.rectangle;

public abstract class Quads {
    protected int width;
    protected int height;

    public Quads(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public abstract void setWidth(int width);

    public abstract void setHeight(int width);
}
