package cc.oobootcamp.shape;

public class Square extends Quads {
    @Override
    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(double width) {
        this.height = width;
        this.width = width;
    }
}
